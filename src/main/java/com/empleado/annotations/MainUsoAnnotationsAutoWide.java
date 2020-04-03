package com.empleado.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUsoAnnotationsAutoWide {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		//pedir un bean al contenedor, que fue creado por anotación en la clase
		EmpleadosInterface antonio=contexto.getBean("IdComercialExperimentado", ComercialExpertoImpl.class);
		
		EmpleadosInterface comercialExperimentado=contexto.getBean("IdComercialExperimentado", ComercialExpertoImpl.class);
		//usar el Bean
		System.out.println("antonio.getTareas(): " + antonio.getTareas());
		
		//Uso de AutoWide: obtener la implementacion de la Interface.
		System.out.println("comercialExperimentado.getTareas(): " + antonio.getInforme());
		
		
		contexto.close();
	}

}
