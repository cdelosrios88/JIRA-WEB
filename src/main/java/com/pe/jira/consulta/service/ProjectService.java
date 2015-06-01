package com.pe.jira.consulta.service;

import java.util.List;

import com.pe.jira.consulta.model.Project;

public interface ProjectService {
	public List<Project> getListProjects();
	public void updateProject(Project o);
	public List<Project> getListProjectsByMap();
}