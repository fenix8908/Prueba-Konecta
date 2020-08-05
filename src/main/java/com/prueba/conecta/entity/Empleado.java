package com.prueba.conecta.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;	
	private Date fecha_ingreseso;
	private String nombre;
	private double salario;
	
	@OneToMany(mappedBy = "empleados", cascade = CascadeType.ALL)
	private List<Solicitud> solicitudes = new ArrayList<>();
	
	
	public Empleado(Date fecha_ingreseso, String nombre, double salario) {
		this.fecha_ingreseso = fecha_ingreseso;
		this.nombre = nombre;
		this.salario = salario;
	}
	
	

	public Empleado() {

	}



	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	/*public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(List<Solicitud> solicitudes) {
		this.solicitudes = solicitudes;
	}*/
	
	
	
	

}
