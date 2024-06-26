package br.com.quintinnodigital.DEFESIOAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintinnodigital.DEFESIOAPI.dto.AcessoRequestDTO;
import br.com.quintinnodigital.DEFESIOAPI.entity.AcessoEntity;
import br.com.quintinnodigital.DEFESIOAPI.repository.AcessoRepository;

@Service
public class AcessoService {
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	public List<AcessoEntity> findAll() {
		return this.acessoRepository.findAll();
	}
	
	public AcessoEntity saveOne(AcessoRequestDTO acessoRequestDTO) {
		return this.acessoRepository.save(AcessoEntity.from(acessoRequestDTO));
	}

}
