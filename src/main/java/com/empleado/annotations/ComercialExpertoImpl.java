package com.empleado.annotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("IdComercialExperimentado")
/* con esta anotación puedo definir el scope de la clase directamente, y no en el XML de configuración */
@Scope("singleton")
public class ComercialExpertoImpl implements EmpleadosInterface, InitializingBean, DisposableBean{
	
	@Autowired
	@Qualifier("informeFinancieroTrimestre1Impl")
	private InformeFinancieroInterface nuevoInforme;

	public void afterPropertiesSet() throws Exception {
		System.out.println("ComercialExpertoImpl: Init....");
	}
	public void destroy() throws Exception {
		System.out.println("ComercialExpertoImpl: Destroy....");
	}
	
	@Autowired
	@Qualifier("informeFinancieroTrimestre1Impl")
	public void setNuevoInforme(InformeFinancieroInterface nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

	// Con el autowired spring scanea la interfaz en todo el proyecto donde esté implementada, asi cuando lo llamo 
	//cargará la info de la clase que lo implementa. 
	//está comentado porque Qualifier no funciona en el contructor
//	@Autowired
	public ComercialExpertoImpl( InformeFinancieroInterface nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}
	public ComercialExpertoImpl() {
		super();
	}

	

	public String getTareas() {
		return "ComercialExpertoImpl: Vender Vender";
	}

	public String getInforme() {
//		return "Informe generado por el comercial";
		//nuevo informe ya esta instanciado, y se responde donde esta implementado.
		//Nota: si la anotacion AutoWide, daria null Pointer Exception
		return nuevoInforme.getInformeFinanciero();
	}



}
