package com.pe.jira.consulta.model;

import org.apache.ibatis.type.Alias;

@Alias("Documento")
public class Documento {
	private Integer codigo;
	private String descripcion;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}