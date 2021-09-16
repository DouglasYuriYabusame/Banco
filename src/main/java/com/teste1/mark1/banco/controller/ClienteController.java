package com.teste1.mark1.banco.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.teste1.mark1.banco.entities.Cliente;
import com.teste1.mark1.banco.repositories.ClienteRepository;





@RestController
@RequestMapping("cliente")

public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepositorio;
	
	@GetMapping("listar")
	public List<Cliente> lista (){
		
		List<Cliente> lista= clienteRepositorio.findAll();
		return lista;
	}
}
