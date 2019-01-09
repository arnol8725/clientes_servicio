package com.bolsadeideas.springboot.backend.apirest.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.repository.ClienteRepository;
import com.bolsadeideas.springboot.backend.apirest.services.ClienteServices;
@Service("clienteServices")
public class ClienteServicesImpl implements ClienteServices {
	
	@Autowired
	@Qualifier("clienteReposritoryCrud")
    public ClienteRepository clienteRepository;

	@Override
	public List<Cliente> detClientes() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	public List<Cliente> saveClientes(Cliente cliente) {
		// TODO Auto-generated method stub
		List<Cliente> detClientes= new ArrayList<Cliente>(); 
		try {
				
			clienteRepository.save(cliente);
			
			detClientes =  (List<Cliente>) clienteRepository.findAll();
			
		}catch (Exception e) {
			// TODO: handle exception
			
		}
		
		return detClientes;
	}

}
