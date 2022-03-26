package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.accionIniciativa;
import com.senamhi.sgdibackend.Entity.valoracion;
import com.senamhi.sgdibackend.Repository.accionIniciativaRepository;
import com.senamhi.sgdibackend.Repository.rolRepository;
import com.senamhi.sgdibackend.Repository.valoracionRepository;
import com.senamhi.sgdibackend.Repository.view.viewAccionIniciativa_valoradaRepository;
import com.senamhi.sgdibackend.excepciones.ResourceNotFoundException;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.senamhi.sgdibackend.Repository.valoracionRepository;

@RestController
@RequestMapping("/api/accionIniciativa/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class AccionIniciativaController {

    private static final Logger log = LogManager.getLogger(AccionIniciativaController.class);

    @Autowired
    accionIniciativaRepository repository;

    @Autowired
    valoracionRepository valoracionRepository;

    @Autowired
    rolRepository rolRepository;

    @Autowired
    viewAccionIniciativa_valoradaRepository viewRepository;

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
    @PostMapping("/agregarValoracion")
    public responseService agregarValoracion(@RequestBody valoracion v){
        responseService respuesta = new responseService();
        try {
            respuesta.content = valoracionRepository.save(v);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping(value = "verificarValoracion", params = "id")
    public responseService verificarValoracion( Integer id){
        responseService respuesta=new responseService();
        try {
            respuesta.content=valoracionRepository.contarValoracion(id);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @PostMapping("/updateFlag/{id}")
    public ResponseEntity<accionIniciativa> updateFlag(@PathVariable Integer id){
        accionIniciativa accion= repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No existe el registro"));
        accion.setFlagEstado("1");

        accionIniciativa accionActualizada = repository.save(accion);
        return ResponseEntity.ok(accion);
    }
    @GetMapping(value = "listarRol")
    public responseService listarRol(){
        responseService respuesta=new responseService();
        try {
            respuesta.content=rolRepository.findAll();
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @PostMapping("/updateAccionIniciativa/{id}")
    public ResponseEntity<accionIniciativa> updateAccionIniciativa(@PathVariable Integer id, @RequestBody accionIniciativa a){
        accionIniciativa accion= repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No existe el registro"));
        accion.setMedioVerificacion(a.getMedioVerificacion());
        accion.setTipoProceso(a.getTipoProceso());
        accion.setFecInicio(a.getFecInicio());
        accion.setFecFin(a.getFecFin());
        accionIniciativa accionActualizada = repository.save(accion);
        return ResponseEntity.ok(accionActualizada);
    }
    @GetMapping(value = "listarViewAI")
    public responseService listarViewAI(){
        responseService respuesta=new responseService();
        try {
            respuesta.content=viewRepository.findAll();
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }

}
