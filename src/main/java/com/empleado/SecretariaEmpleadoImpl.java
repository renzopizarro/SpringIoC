package com.empleado;

public class SecretariaEmpleadoImpl implements EmpleadosInterface{
	private CreacionInformesInterface creacionInforme;
	private String email;
	private String nombreEmpresa;

	
	public SecretariaEmpleadoImpl() {
		super();
	}

	public SecretariaEmpleadoImpl(CreacionInformesInterface creacionInforme) {
		super();
		this.creacionInforme = creacionInforme;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getTareas() {
		return "gestiono empleados ";
	}

	public String getInforme() {
		return "Informe creado por la secreataria " + creacionInforme.getInforme();
	}
	
	public void setCreacionInforme(CreacionInformesInterface creacionInforme) {
		this.creacionInforme = creacionInforme;
	}
}
