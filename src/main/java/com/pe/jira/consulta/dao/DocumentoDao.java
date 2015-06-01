package com.pe.jira.consulta.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.pe.jira.consulta.model.Documento;

public interface DocumentoDao {
	@Select("SELECT codigo, descripcion FROM tb_tipo_documento")
	@Results(value = { @Result(property = "codigo", column = "codigo"),
			@Result(property = "descripcion", column = "descripcion") })
	public List<Documento> getListadoDocumentos();

	@Update("UPDATE tb_tipo_documento SET descripcion=#{descripcion} WHERE codigo=#{codigo}")
	public void updateDocumento(Documento doc);

	@Insert("INSERT INTO tb_tipo_documento(descripcion) VALUES(#{descripcion})")
	public void insertDocumento(Documento doc);

	@Select("SELECT codigo, descripcion FROM tb_tipo_documento WHERE codigo = #{id}")
	@Results(value = { @Result(property = "codigo", column = "codigo"),
			@Result(property = "descripcion", column = "descripcion") })
	public Documento getDocumento(@Param("id") Integer codigo);

	@Delete("DELETE FROM tb_tipo_documento WHERE codigo=#{id}")
	public void deleteDocumento(@Param("id") Integer codigo);
}
