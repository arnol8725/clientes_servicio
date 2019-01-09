package com.bolsadeideas.springboot.backend.apirest.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;

@Repository("clienteReposritoryCrud")
public interface ClienteRepository extends CrudRepository<Cliente,Long> {
	

}
