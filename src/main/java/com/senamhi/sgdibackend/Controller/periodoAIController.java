package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.ciclo;
import com.senamhi.sgdibackend.Entity.periodoAI;
import com.senamhi.sgdibackend.Repository.periodoAIRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/periodoAI/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class periodoAIController {
    private static final Logger log = LogManager.getLogger(periodoAIController.class);

    @Autowired
    periodoAIRepository repository;

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
    public responseService agregar(@RequestBody periodoAI p){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repository.save(p);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }

}
