package com.senamhi.sgdibackend.Controller;


import com.senamhi.sgdibackend.Entity.ciclo;
import com.senamhi.sgdibackend.Entity.productoActividadOperativaActividad;
import com.senamhi.sgdibackend.Repository.productoActividadOperativaActividadRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productoServidor/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class productoServidoresController {

    private static final Logger log = LogManager.getLogger(productoServidoresController.class);

    @Autowired
    productoActividadOperativaActividadRepository repository;

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
    public responseService agregar(@RequestBody productoActividadOperativaActividad p){
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
