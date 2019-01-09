package com.bolsadeideas.springboot.backend.apirest.controller;




import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.services.impl.ClienteServicesImpl;






@CrossOrigin()
@org.springframework.web.bind.annotation.RestController
@RequestMapping(value="/rest",method={RequestMethod.OPTIONS,RequestMethod.GET,RequestMethod.POST} )
public class ClienteController {
	
	private static final Log LOG = LogFactory.getLog(ClienteController.class);
	@Autowired
    @Qualifier("clienteServices")
	private ClienteServicesImpl clientesServiceImpl;
			

	@CrossOrigin()
	 @RequestMapping(value = "/contactosClientes", method = {RequestMethod.GET,RequestMethod.OPTIONS})
	public ResponseEntity<List<Cliente>> checkRest(){
		LOG.info("Entro en el metodo contactosClientes");
		List<Cliente> lista = clientesServiceImpl.detClientes();
		return new ResponseEntity<List<Cliente>>(lista,HttpStatus.OK);
	}
	@CrossOrigin()
	 @RequestMapping(value = "/saveClientes", method = {RequestMethod.POST,RequestMethod.OPTIONS})
	public ResponseEntity<List<Cliente>> saveRest(@RequestBody Cliente cliente, UriComponentsBuilder ucBuilder){
		LOG.info("Entro en el metodo saveClientes");
		List<Cliente> lista = clientesServiceImpl.saveClientes(cliente);
		return new ResponseEntity<List<Cliente>>(lista,HttpStatus.OK);
	}

}
