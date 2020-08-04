package com.prueba.conecta.controller;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.conecta.dto.EmpleadoDto;
import com.prueba.conecta.dto.Mensaje;
import com.prueba.conecta.entity.Empleado;
import com.prueba.conecta.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoController {
	
	@Autowired
	EmpleadoService service;
	
	
	@GetMapping("/lista")
	public ResponseEntity<List<Empleado>>listadoEmpleados(){
		List<Empleado> listado = service.listadoEmpleados();
		return new ResponseEntity(listado, HttpStatus.OK);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<?> crearEmpleado(@RequestBody EmpleadoDto dto){
		if(StringUtils.isBlank(dto.getNombre())) {
			return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
		}
		if(service.existePorNombre(dto.getNombre())) {
			return new ResponseEntity(new Mensaje("Ese empleado ya existe "),HttpStatus.BAD_REQUEST);
		}
		Empleado empleado = new Empleado(dto.getFecha_ingreseso(),dto.getNombre(),dto.getSalario());
		service.guardarEmpleado(empleado);
		return new ResponseEntity(new Mensaje("Empleado creado"),HttpStatus.OK);
	}
	

}
