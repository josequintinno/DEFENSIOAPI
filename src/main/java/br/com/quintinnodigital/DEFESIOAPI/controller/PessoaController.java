package br.com.quintinnodigital.DEFESIOAPI.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping
	public PessoaEntity saveOne(@RequestBody PessoaEntity pessoaEntity) {
		return this.pessoaService.saveOne(pessoaEntity);
	}

	@GetMapping("/info")
	public Map<String, String> API() {
		Map<String, String> jsonMap = new HashMap<>();
		jsonMap.put("nome", "");
		return jsonMap;
	}

}
