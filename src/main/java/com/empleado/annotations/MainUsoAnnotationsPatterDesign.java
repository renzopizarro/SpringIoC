package com.empleado.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Prueba de anotación scope en la clase. Se agrega anotacion de scope en la clase 
 * y se prueba el patron Singleton o Prototype
 * @author pcasus
 *
 */
public class MainUsoAnnotationsPatterDesign {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		// pedir un bean al contenedor, que fue creado por anotación en la clase
		EmpleadosInterface antonio = contexto.getBean("IdComercialExperimentado", ComercialExpertoImpl.class);
		EmpleadosInterface juan = contexto.getBean("IdComercialExperimentado", ComercialExpertoImpl.class);
		System.out.println("ID de objeto antonio" + antonio);
		System.out.println("ID de objeto juan" + juan);

		contexto.close();
	}

}
