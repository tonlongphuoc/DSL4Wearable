package iotwearable.editor.window;

import iotwearable.editor.utilities.MessageContent;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ChooseProjectWindow {
	private List<String> listProject;
	private String project ;
	public ChooseProjectWindow(List<String> list) {
		this.listProject = list;
		project ="";
	}
	/**
	 * View window
	 * @return project name
	 */
	public String view()
	{
		if (listProject == null || listProject.isEmpty()) {
			MessageWindow.show("", MessageContent.message04);
			return "";
		}
		else{
			int selection = JOptionPane.showConfirmDialog(null,
					initMenuProject(),
					"Select project to generate code",
					JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			if (selection == JOptionPane.OK_OPTION) {
				if(project.isEmpty()){
					JOptionPane.showMessageDialog(null,
							"There are no project selected",
							"Empty project", JOptionPane.INFORMATION_MESSAGE);
					return "";
				}
				return project;
			} else {
				return "";
			}
		}
		
	}
	/**
	 * View Menu Project can be generate code
	 * @return
	 */
	public JPanel initMenuProject()
	{
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setLayout(new GridLayout(listProject.size(),1,10,10));
		ButtonGroup radGroup = new ButtonGroup();
		for (String projectName : listProject) {
			if (projectName != null) {
				JRadioButton rad = new JRadioButton(projectName);
				rad.setName(projectName);
				rad.setText("Project: " + projectName);
				rad.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(rad.isSelected())
							project = rad.getName();
						else
							project ="";							
					}
				});
				radGroup.add(rad);
				panel.add(rad);
			}
		}
		panel.setSize(400, 500);
		return panel;
	}
}
