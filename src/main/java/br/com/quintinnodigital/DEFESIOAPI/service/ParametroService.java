package br.com.quintinnodigital.DEFESIOAPI.service;

import br.com.quintinnodigital.DEFESIOAPI.entity.ParametroEntity;
import br.com.quintinnodigital.DEFESIOAPI.repository.ParametroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParametroService {

    @Autowired
    private ParametroRepository parametroRepository;

    public ParametroEntity saveOne(ParametroEntity parametroEntity) {
        return this.parametroRepository.save(parametroEntity);
    }

    public ParametroEntity findOne(Long codigoParametro) {
        Optional<ParametroEntity> parametroEntityOptional = this.parametroRepository.findById(codigoParametro);
        return parametroEntityOptional.get();
    }

    private List<ParametroEntity> findAll() {
        return this.parametroRepository.findAll();
    }

}
