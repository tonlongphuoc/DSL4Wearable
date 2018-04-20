package iotwearable.editor;
import iotwearable.editor.action.CreateMainboardContextMenuAction;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.actions.ActionFactory;
public class MainboardContextMenu extends ContextMenuProvider {
	private ActionRegistry actionRegistry;

	public MainboardContextMenu(EditPartViewer viewer, final ActionRegistry actionRegistry) {
		super(viewer);
		setActionRegistry(actionRegistry);
	}

	private void setActionRegistry(final ActionRegistry actionRegistry) {
		this.actionRegistry = actionRegistry;
	}
	@Override
	public void buildContextMenu(IMenuManager menu) {
		GEFActionConstants.addStandardActionGroups(menu);
		IAction action;
		action = getActionRegistry().getAction(CreateMainboardContextMenuAction.ID_AddLED);
		if(action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);

		action = getActionRegistry().getAction(CreateMainboardContextMenuAction.ID_AddKeypad4x4);
		if(action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);

		action = getActionRegistry().getAction(CreateMainboardContextMenuAction.ID_AddI2CLCD2004);
		if(action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);

		action = getActionRegistry().getAction(CreateMainboardContextMenuAction.ID_AddBuzzer);
		if(action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		
		action = getActionRegistry().getAction(CreateMainboardContextMenuAction.ID_AddBluetoothHC06);
		if(action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		
		action = getActionRegistry().getAction(CreateMainboardContextMenuAction.ID_AddWifiESP8266);
		if(action.isEnabled())
			menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);

		action = getActionRegistry().getAction(ActionFactory.SAVE.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_SAVE, action);

		action = getActionRegistry().getAction(ActionFactory.DELETE.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_REST, action);

		action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);

		action = getActionRegistry().getAction(ActionFactory.REDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);

	}

	private ActionRegistry getActionRegistry() {
		return actionRegistry;
	}


}