package iotwearable.editor.factory;

import iotwearable.model.iotw.I2CLCD2004;
import iotwearable.model.iotw.IotwFactory;

import org.eclipse.gef.requests.CreationFactory;

/**
 * Used to create new I2CLCD2040
 */
public class I2CLCD2004Factory implements CreationFactory{
	@Override
	public Object getNewObject() {
		return IotwFactory.eINSTANCE.createI2CLCD2004();
	}

	@Override
	public Object getObjectType() {
		return I2CLCD2004.class;
	}
}
