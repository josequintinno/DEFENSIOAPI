package br.com.quintinnodigital.DEFESIOAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintinnodigital.DEFESIOAPI.entity.PessoaEntity;
import br.com.quintinnodigital.DEFESIOAPI.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public List<PessoaEntity> finAll() {
		return this.pessoaRepository.findAll();
	}

	public PessoaEntity saveOne(PessoaEntity pessoaEntity) {
		return this.pessoaRepository.save(pessoaEntity);
	}

}
