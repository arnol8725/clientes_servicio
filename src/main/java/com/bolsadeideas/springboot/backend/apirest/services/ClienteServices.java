package com.bolsadeideas.springboot.backend.apirest.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;



public interface ClienteServices {
		public List<Cliente> detClientes();
		public List<Cliente> saveClientes(Cliente cliente);
}
