package com.pe.jira.consulta.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pe.jira.consulta.dao.ProjectDao;
import com.pe.jira.consulta.model.Project;
import com.pe.jira.consulta.service.ProjectService;

@Service("projectService")
@Transactional(propagation = Propagation.SUPPORTS)
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	ProjectDao projectDao;

	public List<Project> getListProjects() {
		return projectDao.getListProjects();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void updateProject(Project o) {
		projectDao.updateProject(o);
	}
	
	@SuppressWarnings("unchecked")
	public List<Project> getListProjectsByMap(){
		try {
			Map<String, Object> map= new HashMap<String, Object>();
			//map.put("codReducido", codReducido);
			projectDao.getListProjectsByMap(map);
			return  (ArrayList<Project>)map.get("getListProjectsByMap");
		} catch (Exception e) {
			e.getStackTrace();
			return null;
		}
	}
}
