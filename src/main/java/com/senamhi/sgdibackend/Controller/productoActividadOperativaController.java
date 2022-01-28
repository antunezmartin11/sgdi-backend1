package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.ciclo;
import com.senamhi.sgdibackend.Entity.productoActividadOperativa;
import com.senamhi.sgdibackend.Repository.productoActividadOperativaRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productoAO/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class productoActividadOperativaController {

    private static final Logger log = LogManager.getLogger(cicloController.class);

    @Autowired
    productoActividadOperativaRepository repository;

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
    public responseService agregar(@RequestBody productoActividadOperativa p){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repository.save(p);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }

    @GetMapping(value = "listarId", params = "id")
    public responseService listar(@RequestParam Integer id){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repository.findByIdAOUnidadOrderByIdAOUnidadDesc(id);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
}
