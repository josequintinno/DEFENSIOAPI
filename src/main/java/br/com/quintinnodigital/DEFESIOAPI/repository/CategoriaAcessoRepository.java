package br.com.quintinnodigital.DEFESIOAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.quintinnodigital.DEFESIOAPI.entity.CategoriaAcessoEntity;

@Repository
public interface CategoriaAcessoRepository extends JpaRepository<CategoriaAcessoEntity, Long> { }
