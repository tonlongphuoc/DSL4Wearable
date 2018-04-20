package iotwearable.editor.keyhandler;

import iotwearable.model.iotw.ConnectivityControl;
import iotwearable.model.iotw.DataControl;
import iotwearable.model.iotw.IOControl;
import iotwearable.model.iotw.StateControl;

/**
 * 
 * Class factory for {@link MoveKeyHandler}
 *
 */
public class MoveKeyHandlerFactory {
	/**
	 * 
	 * @param o : 
	 * 		{@link IOControl},
	 * 		{@link StateControl},
	 * 		{@link ConnectivityControl},
	 * 		{@link DataControl}
	 * @return a instance {@link MoveKeyHander}
	 */
	public static MoveKeyHandler create(Object o){
		MoveKeyHandler keyHandler = null;
		if(o instanceof IOControl){
			keyHandler = new IOControlMove();
		}
		else if(o instanceof StateControl){
			keyHandler = new StateControlMove();
		}
		else if(o instanceof ConnectivityControl){
			keyHandler = new ConnectivityControlMove();
		}
		else if (o instanceof DataControl){
			keyHandler = new DataControlMove();
		}
		return keyHandler;
	}
}