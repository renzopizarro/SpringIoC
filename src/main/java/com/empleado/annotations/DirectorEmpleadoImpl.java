package com.empleado.annotations;

import org.springframework.beans.factory.annotation.Value;

import com.empleado.CreacionInformesInterface;
/**
 * Ejemplo de inyectar valores del properties
 * @author pcasus
 *
 */
 
public class DirectorEmpleadoImpl implements EmpleadosInterface{
	
	private CreacionInformesInterface creacionInforme;
	
	
	@Value("${email}") // valor desde el properties
	private String email;
	@Value("${nombreEmpresa}") // valor desde el properties
	private String nombreEmpresa;
	
	
	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	
 	public DirectorEmpleadoImpl() {
		super();
	}

	public DirectorEmpleadoImpl(CreacionInformesInterface creacionInforme) {
		this.creacionInforme = creacionInforme;
	}

	public String getTareas() {
		return "Soy director financiero: gestiono empleados ";
	}

	public String getInforme() {
		return "Informe creado por el Director: creacionInforme.getInforme() " + creacionInforme.getInforme();
	}
}
