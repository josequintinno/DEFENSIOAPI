package br.com.quintinnodigital.DEFESIOAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintinnodigital.DEFESIOAPI.entity.CategoriaAcessoEntity;
import br.com.quintinnodigital.DEFESIOAPI.service.CategoriaAcessoService;

@RestController
@RequestMapping("/api/v1/categoria-acesso")
@CrossOrigin(origins = "*")
public class CategoriaAcessoController {
	
	@Autowired
	private CategoriaAcessoService categoriaAcessoService;
	
	@GetMapping
	public List<CategoriaAcessoEntity> findAll() {
		return this.categoriaAcessoService.finAll();
	}

}
