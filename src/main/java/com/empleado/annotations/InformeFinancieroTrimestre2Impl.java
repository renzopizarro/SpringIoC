package com.empleado.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrimestre2Impl implements InformeFinancieroInterface{

	public String getInformeFinanciero() {
		return "InformeFinanciero1 Trimestre 1";
	}

}
