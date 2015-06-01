package com.pe.jira.consulta.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.pe.jira.consulta.model.Documento;
import com.pe.jira.consulta.model.Project;
import com.pe.jira.consulta.service.DocumentoService;
import com.pe.jira.consulta.service.ProjectService;

@ManagedBean(name="documentoController")
@SessionScoped
public class DocumentoController {
	
	private List<Project> lstEmpresa;
	private List<Project> lstAreaResponsable;
	private Project project;
	private Project areaResp;
	
	@ManagedProperty("#{documentoService}")
	private DocumentoService documentoService;
	
	@ManagedProperty("#{projectService}")
	private ProjectService projectService;
	
	public DocumentoController(){
		init();
	}
	
	public void init(){
		//lstAreaResponsable = projectService.getListProjectsByMap();
	}
	

	public DocumentoService getDocumentoService() {
		return documentoService;
	}

	public void setDocumentoService(DocumentoService documentoService) {
		this.documentoService = documentoService;
	}

	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	public String irReporteEstado(){
		return "reporteEstado";
	}
	
	public String irReporteFecha(){
		return "reporteFecha";
	}
	
	public String irReporteFechaImplementada(){
		return "reporteFechaImplementada";
	}
	
	public String irReporteAreaInvoclucrada(){
		return "reporteAreaInvoclucrada";
	}
	
	public String irPantalla5(){
		return "pantalla5";
	}
	
	public String irPantalla6(){
		return "pantalla6";
	}
	
	public String irOtraPantalla(){
		System.out.println("xxxxxxxx");
		List<Documento> documentos = documentoService.getListadoDocumentos();
		System.out.println("size:" + documentos.size());
		return "";
	}

	public List<Project> getLstEmpresa() {
		return projectService.getListProjects();
	}

	public void setLstEmpresa(List<Project> lstEmpresa) {
		this.lstEmpresa = lstEmpresa;
	}

	public List<Project> getLstAreaResponsable() {
		return projectService.getListProjectsByMap();
	}

	public void setLstAreaResponsable(List<Project> lstAreaResponsable) {
		this.lstAreaResponsable = lstAreaResponsable;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Project getAreaResp() {
		return areaResp;
	}

	public void setAreaResp(Project areaResp) {
		this.areaResp = areaResp;
	}
}