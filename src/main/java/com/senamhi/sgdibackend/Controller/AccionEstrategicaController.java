package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.accionEstrategica;
import com.senamhi.sgdibackend.Entity.periodoAE;
import com.senamhi.sgdibackend.Entity.accionEstrategicaDireccion;

import com.senamhi.sgdibackend.Repository.accionEstrategicaDirectivoRepository;
import com.senamhi.sgdibackend.Repository.accionEstrategicaRepository;
import com.senamhi.sgdibackend.Repository.periodoAERepository;
import com.senamhi.sgdibackend.Repository.view.viewAccionEstrategicaDireccionRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accionEstrategica/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class AccionEstrategicaController {

    private static final Logger log = LogManager.getLogger(AccionEstrategicaController.class);
    @Autowired
    accionEstrategicaRepository repository;

    @Autowired
    periodoAERepository repositoryPeriodo;

    @Autowired
    accionEstrategicaDirectivoRepository repositoryAEDirectivo;

    @Autowired
    viewAccionEstrategicaDireccionRepository repositoryAEDireccion;

    @PostMapping("agregar")
    public responseService agregar(@RequestBody accionEstrategica c){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repository.save(c);
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
            respuesta.content=repository.findTopByOrderByIdAccionEstrategicaDesc();
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @PostMapping("agregarPeriodoAE")
    public responseService agregarPeriodoAE(@RequestBody periodoAE c){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repositoryPeriodo.save(c);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }

    @PostMapping("agregarAEDirectivo")
    public responseService agregarAEDirectivo(@RequestBody accionEstrategicaDireccion ae){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repositoryAEDirectivo.save(ae);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping(value = "listarDireccionAE", params = "id")
    public responseService listarDireccionAE(Integer id){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repositoryAEDirectivo.findByIdAccionEstrategica(id);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping(value = "listarAEDireccion", params = "nombre")
    public responseService listarAEDireccion(String nombre){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repositoryAEDireccion.findByNomDireccion(nombre);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
}
