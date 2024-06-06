package br.com.quintinnodigital.DEFESIOAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintinnodigital.DEFESIOAPI.entity.CategoriaAcessoEntity;
import br.com.quintinnodigital.DEFESIOAPI.repository.CategoriaAcessoRepository;

@Service
public class CategoriaAcessoService {
	
	@Autowired
	private CategoriaAcessoRepository categoriaAcessoRepository;
	
	public List<CategoriaAcessoEntity> finAll() {
		return this.categoriaAcessoRepository.findAll();
	}

}
