package br.com.quintinnodigital.DEFESIOAPI.controller;

import br.com.quintinnodigital.DEFESIOAPI.dto.AcessoRequestDTO;
import br.com.quintinnodigital.DEFESIOAPI.entity.AcessoEntity;
import br.com.quintinnodigital.DEFESIOAPI.service.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@GetMapping("{codigoAcesso}")
	public AcessoEntity findOne(@PathVariable Long codigoAcesso) {
		return this.acessoService.findOne(codigoAcesso);
	}
	
	@PostMapping
	public AcessoEntity saveOne(@RequestBody AcessoRequestDTO acessoRequestDTO) {
		return this.acessoService.saveOne(acessoRequestDTO);
	}

	@DeleteMapping("{codigoAcesso}")
	public String deleteOne(@PathVariable Long codigoAcesso) {
		this.acessoService.deleteOne(codigoAcesso);
		return "MENSAGEM 001: Credenciais excluída com sucesso!";
	}

	@PutMapping("{codigoAcesso}")
	public AcessoEntity updateOne(@PathVariable Long codigoAcesso, @RequestBody AcessoRequestDTO acessoRequestDTO) {
		AcessoEntity acessoEntity = AcessoEntity.from(acessoRequestDTO);
			acessoEntity.setCodigo(codigoAcesso);
		return this.acessoService.updateOne(acessoEntity);
	}

	@GetMapping("/info")
	public Map<String, String> API() {
		Map<String, String> jsonMap = new HashMap<>();
			jsonMap.put("codigoPessoaMonitorada", "");
			jsonMap.put("codigoCategoria", "");
			jsonMap.put("identificador", "");
			jsonMap.put("chave", "");
			jsonMap.put("nomeAplicativo", "");
			jsonMap.put("url", "");
		return jsonMap;
	}
	
}
