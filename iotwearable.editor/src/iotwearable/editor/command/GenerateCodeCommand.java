package iotwearable.editor.command;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import iotwearable.editor.utilities.MessageContent;
import iotwearable.editor.utilities.ProjectManager;
import iotwearable.editor.window.ChooseProjectWindow;
import iotwearable.editor.window.MessageWindow;
import iotwearable.gen.Gen;
import iotwearable.gen.ModelConverter;
import iotwearable.gen.generator.ManualGenerator;
import iotwearable.utilities.FileUtils;

import org.eclipse.core.resources.IProject;
import org.eclipse.gef.commands.Command;

public class GenerateCodeCommand extends Command {
	ProjectManager manager;
	
	public GenerateCodeCommand() {
		manager = new ProjectManager();
	}
	@Override
	public boolean canExecute() {
		return true;
	}
	@Override
	public void execute() {
		ChooseProjectWindow ui = new ChooseProjectWindow(manager.getProjects());
		String projectName = ui.view();
		IProject project = manager.getProject(projectName);
		if(!projectName.isEmpty()&& project != null)
		{
			Map<String, File> files = manager.getFiles(projectName);
			if(!files.isEmpty()&& files.size() == 2)
			{
				Gen gen = new Gen(files.get("Mainboard"), files.get("StateSchema"));
				String src = gen.run();
				src = src.replace("<project>", projectName);
				ManualGenerator manualGenerator =
						new ManualGenerator(ModelConverter.
								convertToMainboard(files.get("Mainboard").getAbsolutePath()));
				try {
					FileUtils.writeFile(manager.getProject(projectName).getLocation().toString()+"/code.ino", src);
					manager.refreshProject(project);
				} catch (IOException e) {
					MessageWindow.show("Generate code", MessageContent.message02);
				}
				try {
					FileUtils.writeFile(manager.getProject(projectName).getLocation().toString()+"/manual.html",
							manualGenerator.generatorManual(projectName));
					manager.refreshProject(project);
				} catch (IOException e) {
					MessageWindow.show("Generate code", MessageContent.message03);
				}
			}
		}
	}
}
