package br.com.quintinnodigital.DEFESIOAPI.repository;

import br.com.quintinnodigital.DEFESIOAPI.entity.ParametroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParametroRepository extends JpaRepository<ParametroEntity, Long> { }
