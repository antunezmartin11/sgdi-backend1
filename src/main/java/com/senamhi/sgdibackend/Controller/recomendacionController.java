package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.ciclo;
import com.senamhi.sgdibackend.Entity.recomendacionAuditoria;
import com.senamhi.sgdibackend.Repository.recomendacionAuditoriaRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/recomendacion/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class recomendacionController {

    private static final Logger log = LogManager.getLogger(cicloController.class);

    @Autowired
    recomendacionAuditoriaRepository repository;

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
    public responseService agregar(@RequestBody recomendacionAuditoria r){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repository.save(r);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }

    @GetMapping(value = "getRecomendacion", params = "id")
    public responseService getRecomendacion(@RequestParam Integer id){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repository.findByIdInformeAuditoria(id);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
}
