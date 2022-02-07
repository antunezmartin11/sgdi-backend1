package com.senamhi.sgdibackend.Controller;


import com.senamhi.sgdibackend.Entity.actividadServidor;
import com.senamhi.sgdibackend.Entity.ciclo;
import com.senamhi.sgdibackend.Entity.productoActividadOperativaActividad;
import com.senamhi.sgdibackend.Repository.actividadServidorRepository;
import com.senamhi.sgdibackend.Repository.productoActividadOperativaActividadRepository;
import com.senamhi.sgdibackend.Repository.view.viewServidorProductoRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productoServidor/")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class productoServidoresController {

    private static final Logger log = LogManager.getLogger(productoServidoresController.class);

    @Autowired
    productoActividadOperativaActividadRepository repository;

    @Autowired
    actividadServidorRepository repositoryServidor;

    @Autowired
    viewServidorProductoRepository repositoryProductoServidor;

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

    @PostMapping("/agregarServidor")
    public responseService agregarServidor(@RequestBody actividadServidor s){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repositoryServidor.save(s);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping(value = "validarUsuario", params = "codigo")
    public responseService validarUsuario(String codigo){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repositoryServidor.contarRegistro(codigo);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping(value = "listarServidor")
    public responseService listarServidor(){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repositoryServidor.findAll();
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping(value = "listarProductos", params = "id")
    public responseService listarProductos(Integer id){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repository.findByIdActividadServidor(id);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping(value = "listarProductosCodigo", params = "codigo")
    public responseService  listarProductosCodigo(String codigo){
        responseService respuesta=new responseService();
        try {
            respuesta.content=repositoryProductoServidor.findByCodigo(codigo);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }

}

