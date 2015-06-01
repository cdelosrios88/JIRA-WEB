package com.pe.jira.consulta.model;

import org.apache.ibatis.type.Alias;

@Alias("CustomFieldOption")
public class CustomFieldOption {
	private Integer intIdCustomFieldOption;
	private String strCustomValue;
	
	public Integer getIntIdCustomFieldOption() {
		return intIdCustomFieldOption;
	}
	public void setIntIdCustomFieldOption(Integer intIdCustomFieldOption) {
		this.intIdCustomFieldOption = intIdCustomFieldOption;
	}
	public String getStrCustomValue() {
		return strCustomValue;
	}
	public void setStrCustomValue(String strCustomValue) {
		this.strCustomValue = strCustomValue;
	}
}
