package com.pe.jira.consulta.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.pe.jira.consulta.model.Project;

public interface ProjectDao {
	@Select("select ID, pname from project")
	@Results(value = { @Result(property = "intIdProject", column = "ID"),
			@Result(property = "strName", column = "pname") })
	public List<Project> getListProjects();

	@Update("UPDATE project SET pname=#{strName} WHERE ID=#{intIdProject}")
	public void updateProject(Project doc);
	
	
	public void getListProjectsByMap(Map<String, Object> map);
}