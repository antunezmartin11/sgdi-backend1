package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.ciclo;
import com.senamhi.sgdibackend.Repository.informeAuditoriaRepository;
import com.senamhi.sgdibackend.Repository.listaInformeAuditoriaRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.senamhi.sgdibackend.Entity.informeAuditoria;

import java.util.List;

@RestController
@RequestMapping("/api/informeAuditoria/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class informeAuditoriaController {
    private static final Logger log = LogManager.getLogger(informeAuditoriaController.class);

    @Autowired
    informeAuditoriaRepository repository;

    @Autowired
    listaInformeAuditoriaRepository listaRepository;

    @PostMapping("agregar")
    public responseService agregar(@RequestBody informeAuditoria i){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repository.save(i);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
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
    @GetMapping("listarUltimo")
    public responseService listarUltimo(){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repository.findTopByOrderByIdInformeAuditoriaDesc();
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping("listaCompleta")
    public responseService listarCompleto(){
        responseService respuesta= new responseService();
        try {
            respuesta.content = listaRepository.findAll();
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @PostMapping("modificarInforme/{id}")
    public responseService modificarInforme(@PathVariable Integer id,@RequestBody informeAuditoria i){
        responseService respuesta = new responseService();
        try {
            repository.updateInformeAuditoria(i.getNombreDocumento(),
                    i.getNomInforme(),
                    i.getNumDocumento(),
                    i.getNumInforme(),
                    i.getFecRecepcion(),id);
            respuesta.estado=true;
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
}
