package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.actividadOperativa;
import com.senamhi.sgdibackend.Entity.actividadOperativaUnidad;
import com.senamhi.sgdibackend.Repository.actividadOperativaRepository;
import com.senamhi.sgdibackend.Repository.actividadOperativaUnidadRepository;
import com.senamhi.sgdibackend.Repository.view.viewActividadOperativaUnidadRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/actividadOperativa/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class actividadOperativaController {

    private static final Logger log = LogManager.getLogger(actividadOperativaController.class);

    @Autowired
    actividadOperativaRepository repository;

    @Autowired
    actividadOperativaUnidadRepository repositoryAO;

    @Autowired
    viewActividadOperativaUnidadRepository viewRepository;

    @GetMapping("listarAO")
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
    public responseService agregar(@RequestBody actividadOperativa ao){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repository.save(ao);
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
            respuesta.content=repository.findTopByOrderByIdActividadOperativaDesc();
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @PostMapping("/agregarAOUnidad")
    public responseService agregarAOUnidad(@RequestBody actividadOperativaUnidad aou){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repositoryAO.save(aou);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping("listarAOUnidad")
    public responseService listarAOUnidad(){
        responseService respuesta=new responseService();
        try {
            respuesta.content=viewRepository.findAll();
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping(value = "getAOxUnidad", params = "nombre")
    public responseService getAOxUnidad(String nombre){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repositoryAO.findByNombreUnidad(nombre);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping(value = "countAO", params = "id")
    public responseService countAO(Integer id){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repository.contarAO(id);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping(value = "listarAODireccion", params = "nombreUnidad")
    public responseService listarAODireccion(String nombreUnidad){
        responseService respuesta=new responseService();
        try {
            respuesta.content=viewRepository.findByNomDireccionOrderByIdAOUnidadAsc(nombreUnidad);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
}
