package com.empleado.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ejemplo donde no se utiliza el Xml de configuracion
 * se ocupa el arcjhivo de config
 * se restcata un bean configurado en la clase de config
 * se rescatan valores desde el propierties
 *
 */
public class MainUsoAnnotationConfig {

	public static void main(String[] args) {
		// No se ocupa XML
		//ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		// pedir un bean al contenedor, que fue creado por anotación en la clase
		//EmpleadosInterface antonio = contexto.getBean("IdComercialExperimentado", ComercialExpertoImpl.class);
		final AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		//se pide un bean al contenedor.
		final EmpleadosInterface antonio = contexto.getBean("directorFinanciero", EmpleadosInterface.class);
		// usar el Bean
		System.out.println("antonio.getTareas(): " + antonio.getTareas());
		System.out.println("antonio.getInforme(): " + antonio.getInforme());
		
		//ejemplo para obtener el dato desde el properties
		final DirectorEmpleadoImpl directorEmpleadoImpl = contexto.getBean("directorFinanciero", DirectorEmpleadoImpl.class);
		
		System.out.println("Email " + directorEmpleadoImpl.getEmail());
		System.out.println("Empresa " + directorEmpleadoImpl.getNombreEmpresa());

		contexto.close();
	}

}
