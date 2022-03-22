package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.ciclo;
import com.senamhi.sgdibackend.Entity.equipo;
import com.senamhi.sgdibackend.Entity.view.viewAIEquipo;
import com.senamhi.sgdibackend.Repository.equipoRepository;
import com.senamhi.sgdibackend.Repository.view.viewAIEquipoRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/equipo/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class equipoController {
    private static final Logger log = LogManager.getLogger(equipoController.class);

    @Autowired
    equipoRepository repository;

    @Autowired
    viewAIEquipoRepository repositoryAIE;

    @GetMapping("listarEquipo")
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
    public responseService agregar(@RequestBody equipo e){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repository.save(e);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }

    @PostMapping("listarAIEquipo")
    public responseService listarAIEquipo(@RequestBody viewAIEquipo ai){
        responseService respuesta = new responseService();
        try {
            respuesta.content=repositoryAIE.findByIdPlaza(ai.getIdPlaza());
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }

        return respuesta;
    }

}
