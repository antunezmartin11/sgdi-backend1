package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.periodoActividad;
import com.senamhi.sgdibackend.Repository.periodoActividadRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/periodoActividad/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class PeriodoActividadController {

    private static final Logger log = LogManager.getLogger(PeriodoActividadController.class);

    @Autowired
    periodoActividadRepository repository;
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
    public responseService agregar(@RequestBody periodoActividad pa){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repository.save(pa);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
}
