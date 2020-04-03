package com.empleado.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.empleado.CreacionInformesInterface;
/**
 * genero anotaciones para crear beans.
 * @author pcasus
 *
 */

@Configuration
@ComponentScan("com.empleado.annotations")
@PropertySource("classpath:datosEmpresa.properties")
public class EmpleadosConfig {
	//definir el bean
	//el id del Bean es el nombre del Metodo
	@Bean
	public CreacionInformesInterface informeFinancieroDtoCompras() {
		return new InformeFinancieroDtoCompras();
	}
	//definir el bean DirectorFinanciero e inyectar dependencia
	@Bean
	public EmpleadosInterface directorFinanciero() {
		return new DirectorEmpleadoImpl(informeFinancieroDtoCompras());
	}
}
