
package com.empleado;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainUsoEmpleados {

	public static void main(String[] args) {
		//Creación de objetos de tipo empleado
		
//		EmpleadosInterface empleado1 = new DirectorEmpleadoImpl();
//		System.out.println("Objeto directo" + empleado1.getTareas());
		
		
		System.out.println("Working Directory = " +
	              System.getProperty("user.dir"));
		System.out.println("Obtener Context");
		//leer XMl de configuracion
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("Context Obtenido");
		// pedir Beans al contenedor
		EmpleadosInterface directorEmpleado = contexto.getBean("miEmpleado2",DirectorEmpleadoImpl.class);
		EmpleadosInterface jefeEmpleado = contexto.getBean("miEmpleado3",JefeEmpleadoImpl.class);
		EmpleadosInterface secreatarioEmpleado = contexto.getBean("miEmpleado4",SecretariaEmpleadoImpl.class);
		
		SecretariaEmpleadoImpl secretariaEmpleadoImpl= contexto.getBean("miEmpleado4", SecretariaEmpleadoImpl.class);
		
		//usar el bean
		System.out.println("Objeto mediando el context: " + directorEmpleado.getTareas());
		System.out.println("director.getInforme(): " + directorEmpleado.getInforme());
		System.out.println("Obtencion de dependencia por constructor: jefe.getInforme(): " + jefeEmpleado.getInforme());
		System.out.println("Obtencion de dependencia por Setter: secreatario.getInforme(): " + secreatarioEmpleado.getInforme());
		System.out.println("Obtencion de Valores seteados en xml:  \n" 
		+ secretariaEmpleadoImpl.getEmail()
		+ secretariaEmpleadoImpl.getNombreEmpresa());
		
		System.out.println("Cierre del Contexto");
		contexto.close();
	}

}
