
package com.empleado;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPatternDesign {

	public static void main(String[] args) {
		// Creación de objetos de tipo empleado

//		EmpleadosInterface empleado1 = new DirectorEmpleadoImpl();
//		System.out.println("Objeto directo" + empleado1.getTareas());


		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		SecretariaEmpleadoImpl maria = contexto.getBean("miEmpleado4", SecretariaEmpleadoImpl.class);
		SecretariaEmpleadoImpl pedro = contexto.getBean("miEmpleado4", SecretariaEmpleadoImpl.class);
		SecretariaEmpleadoImpl juan = contexto.getBean("miEmpleadoPrototype", SecretariaEmpleadoImpl.class);
		SecretariaEmpleadoImpl diego = contexto.getBean("miEmpleadoPrototype", SecretariaEmpleadoImpl.class);
		if (maria == pedro) {
			System.out.println("Patron de diseño Prototype: maria y pedro apuntan al mismo objeto");
		}
		
		if (maria == pedro) {
			System.out.println("Patron de diseño Singleton: maria y pedro apuntan al mismo objeto");
			System.out.println("Maria: " + maria);
			System.out.println("Pedro: 	"+ pedro);
		}
		
		if (juan== diego) {
			System.out.println("Patron de diseño Singleton");
		}else {
			System.out.println("Patron de diseño Prototype: juan y diego tiene diferente direccion de memoria");
			System.out.println("Juan: " + juan);
			System.out.println("Diego:"+ diego);
		}

		contexto.close();
	}

}
