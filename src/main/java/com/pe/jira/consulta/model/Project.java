package com.pe.jira.consulta.model;

import org.apache.ibatis.type.Alias;

@Alias("Project")
public class Project {
	private Integer intIdProject;
	private String strName;

	public Integer getIntIdProject() {
		return intIdProject;
	}

	public void setIntIdProject(Integer intIdProject) {
		this.intIdProject = intIdProject;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}
}
