package com.pe.jira.consulta.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pe.jira.consulta.dao.DocumentoDao;
import com.pe.jira.consulta.model.Documento;
import com.pe.jira.consulta.service.DocumentoService;

@Service("documentoService")
@Transactional(propagation = Propagation.SUPPORTS)
public class DocumentoServiceImpl implements DocumentoService {
	@Autowired
	DocumentoDao documentoDao;

	public List<Documento> getListadoDocumentos() {
		return documentoDao.getListadoDocumentos();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void updateDocumento(Documento doc) {
		documentoDao.updateDocumento(doc);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void insertDocumento(Documento doc) {
		documentoDao.insertDocumento(doc);
	}

	public Documento getDocumento(Integer codigo) {
		return documentoDao.getDocumento(codigo);
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void deleteDocumento(Integer codigo) {
		documentoDao.deleteDocumento(codigo);
	}
}
