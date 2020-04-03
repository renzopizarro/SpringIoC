package com.empleado;

public class DirectorEmpleadoImpl implements EmpleadosInterface{
	
	private CreacionInformesInterface creacionInforme;

	private void metodoInicial() {
		System.out.println("DirectorEmpleadoImpl: Init....");
	}
	
	private void metodoFinal() {
		System.out.println("DirectorEmpleadoImpl: Destroy...");
	}
	public DirectorEmpleadoImpl() {
		super();
	}

	public DirectorEmpleadoImpl(CreacionInformesInterface creacionInforme) {
		this.creacionInforme = creacionInforme;
	}

	public String getTareas() {
		return "gestiono empleados ";
	}

	public String getInforme() {
		return "Informe creado por el Director: creacionInforme.getInforme() " + creacionInforme.getInforme();
	}
}
