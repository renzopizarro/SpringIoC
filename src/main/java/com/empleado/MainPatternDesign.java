
package com.empleado;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPatternDesign {

	public static void main(String[] args) {
		// Creaci�n de objetos de tipo empleado

//		EmpleadosInterface empleado1 = new DirectorEmpleadoImpl();
//		System.out.println("Objeto directo" + empleado1.getTareas());


		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		SecretariaEmpleadoImpl maria = contexto.getBean("miEmpleado4", SecretariaEmpleadoImpl.class);
		SecretariaEmpleadoImpl pedro = contexto.getBean("miEmpleado4", SecretariaEmpleadoImpl.class);
		SecretariaEmpleadoImpl juan = contexto.getBean("miEmpleadoPrototype", SecretariaEmpleadoImpl.class);
		SecretariaEmpleadoImpl diego = contexto.getBean("miEmpleadoPrototype", SecretariaEmpleadoImpl.class);
		if (maria == pedro) {
			System.out.println("Patron de dise�o Prototype: maria y pedro apuntan al mismo objeto");
		}
		
		if (maria == pedro) {
			System.out.println("Patron de dise�o Singleton: maria y pedro apuntan al mismo objeto");
			System.out.println("Maria: " + maria);
			System.out.println("Pedro: 	"+ pedro);
		}
		
		if (juan== diego) {
			System.out.println("Patron de dise�o Singleton");
		}else {
			System.out.println("Patron de dise�o Prototype: juan y diego tiene diferente direccion de memoria");
			System.out.println("Juan: " + juan);
			System.out.println("Diego:"+ diego);
		}

		contexto.close();
	}

}
