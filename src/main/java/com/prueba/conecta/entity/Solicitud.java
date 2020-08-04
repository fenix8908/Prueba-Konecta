package com.prueba.conecta.entity;

import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Solicitud {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	private String codigo;
	private String descripcion;
	private String resumen;

	/*@ManyToOne
	@JoinColumn(name = "FK_EMPLEADO", nullable = false)
	private Empleado empleados;*/

	public Solicitud(String codigo, String descripcion, String resumen) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.resumen = resumen;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	/*public Empleado getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleado empleados) {
		this.empleados = empleados;
	}*/
	
	
	
	

}
