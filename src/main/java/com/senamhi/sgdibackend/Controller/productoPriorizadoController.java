package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.productoPriorizado;
import com.senamhi.sgdibackend.Repository.listaProductoPriorizadoRepository;
import com.senamhi.sgdibackend.Repository.productoPriorizadoRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productoPriorizado/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class productoPriorizadoController {

    private static final Logger log = LogManager.getLogger(productoPriorizadoController.class);

    @Autowired
    productoPriorizadoRepository repository;

    @Autowired
    listaProductoPriorizadoRepository listaRepository;

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

    @GetMapping("listarCompleto")
    public responseService listarCompleto(){
        responseService respuesta=new responseService();
        try {
            respuesta.content=listaRepository.findAll();
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }

    @PostMapping("agregar")
    public responseService agregar(@RequestBody productoPriorizado p){
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
