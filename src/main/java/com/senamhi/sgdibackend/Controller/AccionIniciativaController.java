package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.accionIniciativa;
import com.senamhi.sgdibackend.Repository.accionIniciativaRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/accionIniciativa/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class AccionIniciativaController {

    private static final Logger log = LogManager.getLogger(AccionIniciativaController.class);

    @Autowired
    accionIniciativaRepository repository;

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

    @PostMapping("/agregar")
    public responseService agregar(@RequestBody accionIniciativa ai){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repository.save(ai);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
}
