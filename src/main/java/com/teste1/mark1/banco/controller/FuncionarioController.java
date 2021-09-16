package com.teste1.mark1.banco.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.teste1.mark1.banco.entities.Funcionario;
import com.teste1.mark1.banco.repositories.FuncionarioRepository;





@RestController
@RequestMapping("funcionario")

public class FuncionarioController {

	@Autowired
	private FuncionarioRepository funcionarioRepositorio;
	
	@GetMapping("listar")
	public List<Funcionario> lista (){
		
		List<Funcionario> lista= funcionarioRepositorio.findAll();
		return lista;
	}
}
