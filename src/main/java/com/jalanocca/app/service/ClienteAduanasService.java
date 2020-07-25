package com.jalanocca.app.service;

import org.springframework.http.ResponseEntity;

import com.jalanocca.app.model.entity.ClientesAduanasEntity;

public interface ClienteAduanasService {
	
	ResponseEntity<?> obtenerTodo();
	
	ResponseEntity<?> obtenerPorCodigo(String codigo);
	
	ResponseEntity<?> obtenerPorNombre(String nombre);
	
	ResponseEntity<?> crearCliente(ClientesAduanasEntity request);
	
	ResponseEntity<?> actualizarCliente(ClientesAduanasEntity request);
	
	ResponseEntity<?> eliminarCliente(String codigo);

}
