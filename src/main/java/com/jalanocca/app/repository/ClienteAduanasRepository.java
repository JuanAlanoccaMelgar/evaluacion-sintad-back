package com.jalanocca.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jalanocca.app.model.entity.ClientesAduanasEntity;

@Repository
public interface ClienteAduanasRepository extends JpaRepository<ClientesAduanasEntity, String> {
	
	ClientesAduanasEntity findByCliente(String cliente);
	
	ClientesAduanasEntity findByNombre(String nombre);

}
