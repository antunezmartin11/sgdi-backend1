package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.ciclo;
import com.senamhi.sgdibackend.Entity.productoAccionEstrategica;
import com.senamhi.sgdibackend.Repository.productoAccionEstrategicaRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productoAE/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class productoAccionEstrategicaController {

    private static final Logger log = LogManager.getLogger(productoAccionEstrategicaController.class);

    @Autowired
    productoAccionEstrategicaRepository repository;

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
    public responseService agregar(@RequestBody productoAccionEstrategica p){
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
    public responseService listarId(@RequestParam Integer id){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repository.findByIdAEDireccion(id);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;

    }
}
