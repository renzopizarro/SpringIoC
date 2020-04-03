package com.empleado.annotations;

import org.springframework.stereotype.Component;

@Component //cuando no se escribe se queda con minuscula el id del bean
public class InformeFinancieroTrimestre1Impl implements InformeFinancieroInterface{

	public String getInformeFinanciero() {
		return "InformeFinanciero1 Trimestre 2";
	}

}
