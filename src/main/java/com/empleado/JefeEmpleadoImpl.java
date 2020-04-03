package com.empleado;

public class JefeEmpleadoImpl implements EmpleadosInterface{
	
	
	private CreacionInformesInterface creacionInforme;
	
	public JefeEmpleadoImpl() {
		super();
	}

	public JefeEmpleadoImpl(CreacionInformesInterface creacionInforme) {
		super();
		this.creacionInforme = creacionInforme;
	}

	public String getTareas() {
		return "gestiono empleados ";
	}

	public String getInforme() {
		return "Informe creado por Jefe " + creacionInforme.getInforme();
	}
}
