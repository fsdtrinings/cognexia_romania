package p1;

import java.io.Serializable;

public class Project
{
	
	private String projectName;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String projectName) {
		super();
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "Project [projectName=" + projectName + "]";
	}
	
	

}
