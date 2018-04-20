package iotwearable.editor;

import iotwearable.editor.action.CreateStateSchemaContextMenuAction;
import iotwearable.editor.keyhandler.MoveKeyListener;
import iotwearable.editor.part.IoTWEditPartFactory;
import iotwearable.model.iotw.IotwPackage;
import iotwearable.model.iotw.StateSchema;
import iotwearable.model.iotw.provider.IotwItemProviderAdapterFactory;

import java.io.IOException;
import java.util.EventObject;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.MouseWheelHandler;
import org.eclipse.gef.MouseWheelZoomHandler;
import org.eclipse.gef.dnd.TemplateTransferDragSourceListener;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithPalette;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.gef.ui.properties.UndoablePropertySheetPage;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;

public class StateSchemaEditor extends GraphicalEditorWithPalette {
	
	private StateSchema schema;
	
	public StateSchemaEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}
	
	@Override
	protected PaletteRoot getPaletteRoot() {
		return new StatePalette();
	}

	@Override
	protected void initializeGraphicalViewer() {
		getGraphicalViewer().setContents(schema);
		
	}

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		getGraphicalViewer().setEditPartFactory(new IoTWEditPartFactory());
		getGraphicalViewer().setProperty(MouseWheelHandler.KeyGenerator.getKey(SWT.MOD1),
				MouseWheelZoomHandler.SINGLETON);
		getGraphicalViewer().setContextMenu(new StateSchemaContextMenu(getGraphicalViewer(), getActionRegistry()));
		// D&D
		  getGraphicalViewer().addDropTargetListener(new TemplateTransferDropTargetListener(getGraphicalViewer()));
		  getEditDomain().getPaletteViewer().addDragSourceListener(
		    new TemplateTransferDragSourceListener(getEditDomain().getPaletteViewer()));
		  // end D&D
		  
		  //Move figure
		 getGraphicalViewer().getControl().addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				MoveKeyListener keyListener = new MoveKeyListener();
				@SuppressWarnings("unchecked")
				List<EditPart> editParts = getGraphicalViewer().getSelectedEditParts();
				if(editParts != null){
					if(!editParts.isEmpty()){
						for(EditPart editPart : editParts){
							keyListener.setListen(e, editPart, getCommandStack());
						}
					}
				}
			}
		});
		 //end Move figure
	}
	
	private IFile file;
	private Resource resource;
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		if (resource == null)
			return;

		try {
			resource.save(null);
			file.touch(null);
			getCommandStack().markSaveLocation();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
		loadInput(input);
		setPartName(input.getName());
	}
	
	private void loadInput(IEditorInput input) {
		IotwPackage.eINSTANCE.eClass(); // This initializes the Package
											// singleton implementation.
		ResourceSet resourceSet = new ResourceSetImpl();
		if (input instanceof IFileEditorInput) {
			IFileEditorInput fileInput = (IFileEditorInput) input;
			file = fileInput.getFile();
			resource = resourceSet.createResource(URI.createURI(file
					.getLocationURI().toString()));
			try {
				resource.load(null);
				schema = (StateSchema) resource.getContents().get(0);
			} catch (IOException e) {
				// TODO do something smarter.
				e.printStackTrace();
				resource = null;
			}
		}
	}
	//show properties
		PropertySheetPage propertyPage;
		@SuppressWarnings("rawtypes")
		@Override
		public Object getAdapter(Class type) {
			if (type == ZoomManager.class) {
				return getGraphicalViewer().getProperty(
						ZoomManager.class.toString());
			}
			 if(type.equals(IPropertySheetPage.class)) {
		            if(propertyPage == null) {
		                propertyPage = (UndoablePropertySheetPage) super
		                        .getAdapter(type);
		                // A new PropertySourceProvider was implemented to fetch the model
		                // from the edit part when required. The property source is provided
		                // by the generated EMF classes and wrapped by the AdapterFactoryContentProvider
		                // to yield standard eclipse interfaces.
		                IPropertySourceProvider sourceProvider = new IPropertySourceProvider() {
		                    IPropertySourceProvider modelPropertySourceProvider = new AdapterFactoryContentProvider(new IotwItemProviderAdapterFactory());
		 
							@Override
		                    public IPropertySource getPropertySource(Object object) {
		                        IPropertySource source = null;
		                        if(object instanceof EditPart) {
		                            source = modelPropertySourceProvider.getPropertySource(((EditPart) object).getModel());
		                        } else {
		                            source = modelPropertySourceProvider.getPropertySource(object);
		                        }
		 
		                        if(source != null) {
		                            return new UnwrappingPropertySource(source);
		                        } else {
		                            return null;
		                        }
		                    }
		 
		                };
		                UndoablePropertySheetEntry root = new UndoablePropertySheetEntry(getCommandStack());
		                root.setPropertySourceProvider(sourceProvider);
		                propertyPage.setRootEntry(root);
		            }
		            return propertyPage;
		        }
		        return super.getAdapter(type);
		}
		
		@Override
		public void commandStackChanged(EventObject event) {
			firePropertyChange(PROP_DIRTY);
	        super.commandStackChanged(event);
		}
		
		public class UnwrappingPropertySource implements IPropertySource {
	        private IPropertySource source;
	 
	        public UnwrappingPropertySource(final IPropertySource source) {
	            this.source = source;
	        }
	 
	        @Override
	        public Object getEditableValue() {
	            Object value = source.getEditableValue();
	            if(value instanceof PropertyValueWrapper) {
	                PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
	                return wrapper.getEditableValue(null);
	            } else {
	                return source.getEditableValue();
	            }
	        }
	 
	        @Override
	        public IPropertyDescriptor[] getPropertyDescriptors() {
	            return source.getPropertyDescriptors();
	        }
	 
	        @Override
	        public Object getPropertyValue(Object id) {
	            Object value = source.getPropertyValue(id);
	            if(value instanceof PropertyValueWrapper) {
	                PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
	                return wrapper.getEditableValue(null);
	            } else {
	                return source.getPropertyValue(id);
	            }
	        }
	 
	        @Override
	        public boolean isPropertySet(Object id) {
	            return source.isPropertySet(id);
	        }
	 
	        @Override
	        public void resetPropertyValue(Object id) {
	            source.resetPropertyValue(id);
	        }
	 
	        @Override
	        public void setPropertyValue(Object id, Object value) {
	            source.setPropertyValue(id, value);
	        }
	    }
		protected void createActions() {
			super.createActions();
			IAction action = new CreateStateSchemaContextMenuAction(this, CreateStateSchemaContextMenuAction.ID_AddStateFrame, schema);
			getActionRegistry().registerAction(action);
			action = new  CreateStateSchemaContextMenuAction(this,CreateStateSchemaContextMenuAction.ID_AddDecision, schema);
			getActionRegistry().registerAction(action);
			action = new  CreateStateSchemaContextMenuAction(this,CreateStateSchemaContextMenuAction.ID_AddEndPoint, schema);
			getActionRegistry().registerAction(action);
			action = new  CreateStateSchemaContextMenuAction(this,CreateStateSchemaContextMenuAction.ID_AddStartPoint, schema);
			getActionRegistry().registerAction(action);
		}
		@Override
		public DefaultEditDomain getEditDomain() {
			return super.getEditDomain();
		}

		public StateSchema getSchema() {
			return schema;
		}
		
}
