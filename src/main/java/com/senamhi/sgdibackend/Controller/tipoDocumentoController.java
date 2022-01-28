package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Repository.tipoDocumentoRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tipoDocumento/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class tipoDocumentoController {


    private static final Logger log = LogManager.getLogger(tipoDocumentoController.class);

    @Autowired
    tipoDocumentoRepository repository;

    @GetMapping("listar")
    public responseService listar(){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repository.findAll();
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
}
