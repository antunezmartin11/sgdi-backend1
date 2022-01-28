package com.senamhi.sgdibackend.Controller;
import com.senamhi.sgdibackend.Entity.hito;
import com.senamhi.sgdibackend.Entity.hitoVinculado;
import com.senamhi.sgdibackend.Repository.hitoVinculadoRepository;
import com.senamhi.sgdibackend.Repository.hitoRepository;
import com.senamhi.sgdibackend.Repository.view.ViewHitoVinculadoRepository;
import com.senamhi.sgdibackend.util.responseService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hito")
@CrossOrigin(origins = { "*" }, allowedHeaders = "*")
public class hitoController {
    private static final Logger log = LogManager.getLogger(hitoController.class);

    @Autowired
    hitoRepository repository;

    @Autowired
    hitoVinculadoRepository hitoDirectivo;

    @Autowired
    ViewHitoVinculadoRepository viewHitoRepository;

    @GetMapping("listarHito")
    public responseService listarHito(){
        responseService respuesta = new responseService();
        try {
            respuesta.content= repository.findAll();
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }

        return respuesta;

    }
    @PostMapping("/agregar")
    public responseService agregar(@RequestBody hito h){
        responseService respuesta = new responseService();
        try {
            respuesta.content = repository.save(h);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping(value = "listarTipo", params = "tipo")
    public responseService listarTipo(@RequestParam Integer tipo){
        responseService respuesta = new responseService();
        try {
            respuesta.content= repository.findByTipoOrderByIdHitoDesc(tipo);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }

        return respuesta;

    }
    @GetMapping("ultimoHito")
    public responseService ultimoHito(){
        responseService respuesta = new responseService();
        try {
            respuesta.content= repository.findTopByOrderByIdHitoDesc();
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }

        return respuesta;

    }
    @PostMapping("/agregarHitoDirectivo")
    public responseService agregarHitoDirectivo(@RequestBody hitoVinculado hd){
        responseService respuesta = new responseService();
        try {
            respuesta.content = hitoDirectivo.save(hd);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }
        return respuesta;
    }
    @GetMapping(value = "getHitoVinculado", params = {"tipo", "idHito"})
    public responseService getHitoVinculado(@RequestParam Integer tipo, Integer idHito){
        responseService respuesta = new responseService();
        try {
            respuesta.content= viewHitoRepository.findByTipoAndIdHito(tipo, idHito);
        }catch (Exception ex){
            respuesta.SetException(ex);
            log.error(ex.getMessage(), ex.getCause());
        }

        return respuesta;

    }

}
