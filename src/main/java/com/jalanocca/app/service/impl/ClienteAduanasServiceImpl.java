package com.jalanocca.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jalanocca.app.model.entity.ClientesAduanasEntity;
import com.jalanocca.app.repository.ClienteAduanasRepository;
import com.jalanocca.app.service.ClienteAduanasService;

@Service
public class ClienteAduanasServiceImpl implements ClienteAduanasService {
	
	@Autowired
	private ClienteAduanasRepository repo;

	@Override
	public ResponseEntity<?> obtenerTodo() {
		List<ClientesAduanasEntity> clientes = repo.findAll();
		return new ResponseEntity<List<ClientesAduanasEntity>>(clientes, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> obtenerPorCodigo(String codigo) {
		ClientesAduanasEntity cliente = repo.findByCliente(codigo);
		return new ResponseEntity<ClientesAduanasEntity>(cliente, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> obtenerPorNombre(String nombre) {
		ClientesAduanasEntity cliente = repo.findByNombre(nombre);
		return new ResponseEntity<ClientesAduanasEntity>(cliente, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> crearCliente(ClientesAduanasEntity request) {
		repo.save(request);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<?> actualizarCliente(ClientesAduanasEntity request) {
		repo.save(request);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> eliminarCliente(String codigo) {
		repo.deleteById(codigo);
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
