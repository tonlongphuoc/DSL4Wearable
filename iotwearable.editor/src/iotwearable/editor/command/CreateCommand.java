package iotwearable.editor.command;

import iotwearable.model.iotw.Control;
import iotwearable.model.iotw.Mainboard;

import org.eclipse.gef.commands.Command;

public abstract class CreateCommand extends Command {
	// Return a id for IOControl, ConnectivityControl
	String getID(Control control, Mainboard mainboard) {
		if (mainboard == null)
			return "";
		String id = "control_0";
		String ids = "";

		try {
			for (Control _control : mainboard.getControls()) {
				ids += "|" + _control.getId();
			}
			for (Control _control : mainboard.getConnectivities()) {
				ids += "|" + _control.getId();
			}
		} catch (Exception e) {
		}
		int i = 0;
		while (ids.contains(id)) {
			i++;
			id = "control_" + i;
		}
		return id;
	}
}