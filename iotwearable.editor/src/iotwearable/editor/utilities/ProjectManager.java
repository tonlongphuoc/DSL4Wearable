package iotwearable.editor.utilities;

import iotwearable.model.iotw.ArduinoUNOR3;
import iotwearable.model.iotw.StateSchema;
import iotwearable.utilities.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

/**
 * 
 * Manage project directory.
 *
 */
public class ProjectManager {
	IWorkspaceRoot workSpaceRoot = ResourcesPlugin.getWorkspace().getRoot();

	public ProjectManager() {

	}
	public IProject getProject(){
		return workSpaceRoot.getProject();
	}
	
	public String getInfo(IProject project){
		String info = "info : " + project.getName();
		if(project != null){
			for (File file : FileUtils.getFiles(project.getLocation().toString())) {
				if (FileUtils.getFileExtension(file).equals("iotw")){
					if (classify(file).equals("Mainboard"))
						info += "\nMainboard: " + file.getName();
					else if(classify(file).equals("StateSchema"))
						info += "\nState Schema: " + file.getName();
				}
			}
		}
		return info;
	}

	public void refreshProject(IProject project) {
		if (project != null) {
			try {
				project.refreshLocal(IResource.DEPTH_INFINITE,
						new NullProgressMonitor());
			} catch (CoreException e) {
			}
		}
	}
	
	/**
	 * Consider the directory structure of the project. It is possible to
	 * automatically add some files if they are not already in the project.
	 * 
	 * An iot wearable project must contain one iotw file for the description
	 * for the mainboard and one iotw file for the description for the state
	 * machine (state schema)
	 * 
	 * @param project
	 *            {@link IProject}
	 * @return Returns true if the correct structure.
	 */
	public boolean isProject(IProject project) {
		int num = 0;
		String[] infos = getInfo(project).split("\n");
		for(String str : infos){
			if(str.contains("Mainboard")){
				num++;
			}
			else if(str.contains("State Schema")){
				num++;
			}
		}
		if(num == 2)
			return true;
		return false;
	}

	public IProject getProject(String name) {
		return workSpaceRoot.getProject(name);
	}

	/**
	 * Gets files of project
	 * 
	 * @param projectName
	 * @return files : {@linkplain Map< String, File >}
	 */
	public Map<String, File> getFiles(String projectName) {
		Map<String, File> map = new HashMap<String, File>();
		if (projectName != null) {
			for (IProject iProject : workSpaceRoot.getProjects()) {
				if (iProject.getName().equals(projectName)) {
					List<File> allFiles = FileUtils.getFiles(iProject
							.getLocation().toString());
					for (File file : allFiles) {
						if (FileUtils.getFileExtension(file).equals("iotw")) {
							String type = "";
							type = classify(file);
							if (!type.isEmpty()) {
								map.put(type, file);
							}
						}
					}
				}
			}
		}
		return map;
	}

	// Classify file
	private String classify(File file) {
		String line = null;
		String type = "";
		try {
			FileReader fileReader = new FileReader(file.getAbsoluteFile());
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			line = bufferedReader.readLine();
			line = bufferedReader.readLine();
			if (line.contains(ArduinoUNOR3.class.getSimpleName())&& file.getName().equals("mainboard.iotw")) {
				type = "Mainboard";
			} else if (line.contains(StateSchema.class.getSimpleName())&& file.getName().equals("stateSchema.iotw")) {
				type = "StateSchema";
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return type;
	}

	/**
	 * Get name projects, which is a project iot wearable
	 * 
	 * @return
	 */
	public List<String> getProjects() {
		List<String> projectName = new ArrayList<String>();
		for (IProject iProject : workSpaceRoot.getProjects()) {
			if (isProject(iProject)) {
				projectName.add(iProject.getName());
			}
		}
		return projectName;
	}
}