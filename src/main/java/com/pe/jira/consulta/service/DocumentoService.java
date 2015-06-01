package com.pe.jira.consulta.service;

import java.util.List;

import com.pe.jira.consulta.model.Documento;

public interface DocumentoService {
	public List<Documento> getListadoDocumentos();
	public void updateDocumento(Documento doc);
	public void insertDocumento(Documento doc);
	public Documento getDocumento(Integer codigo);
	public void deleteDocumento(Integer codigo);
}