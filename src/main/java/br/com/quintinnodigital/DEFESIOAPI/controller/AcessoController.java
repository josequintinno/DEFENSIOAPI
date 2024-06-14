package br.com.quintinnodigital.DEFESIOAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintinnodigital.DEFESIOAPI.dto.AcessoRequestDTO;
import br.com.quintinnodigital.DEFESIOAPI.entity.AcessoEntity;
import br.com.quintinnodigital.DEFESIOAPI.service.AcessoService;

@RestController
@RequestMapping("/api/v1/acesso")
@CrossOrigin(origins = "*")
public class AcessoController {
	
	@Autowired
	private AcessoService acessoService;
	
	@GetMapping
	public List<AcessoEntity> findAll() {
		return this.acessoService.findAll();
	}
	
	@PostMapping
	public AcessoEntity saveOne(@RequestBody AcessoRequestDTO acessoRequestDTO) {
		return this.acessoService.saveOne(acessoRequestDTO);
	}
	
}
