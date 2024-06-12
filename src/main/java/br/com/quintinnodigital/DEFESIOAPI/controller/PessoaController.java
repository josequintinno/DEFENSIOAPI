package br.com.quintinnodigital.DEFESIOAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintinnodigital.DEFESIOAPI.entity.PessoaEntity;
import br.com.quintinnodigital.DEFESIOAPI.service.PessoaService;


@RestController
@RequestMapping("/api/v1/pessoa")
@CrossOrigin(origins = "*")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping
	public List<PessoaEntity> findAll() {
		return this.pessoaService.finAll();
	}

}
