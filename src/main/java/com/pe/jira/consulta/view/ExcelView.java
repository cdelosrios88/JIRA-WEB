package com.pe.jira.consulta.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.pe.jira.consulta.model.Documento;

public class ExcelView extends AbstractExcelView {
	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			HSSFWorkbook libro, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		@SuppressWarnings("unchecked")
		List<Documento> documentos = (List<Documento>) model
				.get("listaDocumentos");
		HSSFSheet hoja = libro.createSheet("XLS Capacitacion");
		int tamanio = 0;
		if (documentos != null && !documentos.isEmpty()) {
			for (Documento documento : documentos) {
				HSSFRow fila = hoja.createRow(tamanio++);
				HSSFCell columnaCodigo = fila.createCell(0);
				HSSFCell columnaDescripcion = fila.createCell(1);
				columnaCodigo.setCellValue(documento.getCodigo());
				columnaDescripcion.setCellValue(documento.getDescripcion());
			}
		}
	}
}
