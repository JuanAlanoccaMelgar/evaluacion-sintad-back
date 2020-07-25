package com.jalanocca.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jalanocca.app.model.entity.ClientesAduanasEntity;
import com.jalanocca.app.service.ClienteAduanasService;

@RestController
@RequestMapping("/cliente")
public class ClienteAduanasController {
	
	@Autowired
	private ClienteAduanasService service;
	
	@GetMapping
	public ResponseEntity<?> obtenerTodo() {
		return service.obtenerTodo();
	}
	
	@GetMapping("/porCodigo/{codigo}")
	public ResponseEntity<?> obtenerPorCodigo(@PathVariable("codigo") String codigo) {
		return service.obtenerPorCodigo(codigo);
	}
	
	@GetMapping("/porNombre/{nombre}")
	public ResponseEntity<?> obtenerPorNombre(@PathVariable("nombre") String nombre) {
		return service.obtenerPorNombre(nombre);
	}
	
	@PostMapping
	public ResponseEntity<?> crearCliente(@RequestBody ClientesAduanasEntity request) {
		return service.crearCliente(request);
	}
	
	@PutMapping
	public ResponseEntity<?> actualizarCliente(@RequestBody ClientesAduanasEntity request) {
		return service.actualizarCliente(request);
	}
	
	@DeleteMapping("{codigo}")
	public ResponseEntity<?> eliminarCliente(@PathVariable("codigo") String codigo) {
		return service.eliminarCliente(codigo);
	}

}
