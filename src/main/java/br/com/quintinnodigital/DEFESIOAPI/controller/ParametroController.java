package br.com.quintinnodigital.DEFESIOAPI.controller;

import br.com.quintinnodigital.DEFESIOAPI.service.ParametroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/parametro")
@CrossOrigin(origins = "*")
public class ParametroController {

    @Autowired
    private ParametroService parametroService;

    @GetMapping("/info")
    public Map<String, String> informacao() {
        Map<String, String> parametro = new HashMap<>();
            parametro.put("descricao:", "");
            parametro.put("sigla:", "");
            parametro.put("valor:", "");
        return parametro;
    }

}
