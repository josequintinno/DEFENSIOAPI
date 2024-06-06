package br.com.quintinnodigital.DEFESIOAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.quintinnodigital.DEFESIOAPI.entity.PessoaEntity;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> { }
