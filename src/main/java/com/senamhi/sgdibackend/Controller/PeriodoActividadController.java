package com.senamhi.sgdibackend.Controller;

import com.senamhi.sgdibackend.Entity.periodoActividad;
import com.senamhi.sgdibackend.Repository.periodoActividadRepository;
import com.senamhi.sgdibackend.excepciones.ResourceNotFoundException;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    @GetMapping(value = "contarPeriodoServidor", params = "id")
    public responseService contarPeriodoServidor( Integer id){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repository.contarPeriodoServidor(id);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping(value = "listarId/{id}")
    public responseService listarId(@PathVariable Integer id){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repository.listaxId(id);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }

    @PostMapping("/updatePeriodoActividad/{id}")
    public ResponseEntity<periodoActividad> updatePeriodoActividad(@PathVariable Integer id, @RequestBody periodoActividad a){
        periodoActividad pa=repository.findById(id).orElseThrow(()->new ResourceNotFoundException("No existe el registro"));
        pa.setIdPeriodo(a.getIdPeriodo());
        pa.setPeso(a.getPeso());
        periodoActividad actualizado = repository.save(pa);
        return ResponseEntity.ok(actualizado);
    }
}
