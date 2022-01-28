package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.ciclo;
import com.senamhi.sgdibackend.Repository.cicloRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ciclo/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class cicloController {

    private static final Logger log = LogManager.getLogger(cicloController.class);

    @Autowired
    cicloRepository repository;

    @GetMapping("listarCiclo")
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
    public responseService agregar(@RequestBody ciclo c){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repository.save(c);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }

    @PutMapping("/modificar")
    public responseService modificar(@RequestBody ciclo c){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repository.save(c);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }

}
