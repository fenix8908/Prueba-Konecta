package com.prueba.conecta.dto;

import java.util.Date;

public class EmpleadoDto {

	
	private Date fecha_ingreseso;
	private String nombre;
	private double salario;
	
	
	public EmpleadoDto() {
		
	}

	public EmpleadoDto(Date fecha_ingreseso, String nombre, double salario) {
		this.fecha_ingreseso = fecha_ingreseso;
		this.nombre = nombre;
		this.salario = salario;
	}

	public Date getFecha_ingreseso() {
		return fecha_ingreseso;
	}
	

	public void setFecha_ingreseso(Date fecha_ingreseso) {
		this.fecha_ingreseso = fecha_ingreseso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
