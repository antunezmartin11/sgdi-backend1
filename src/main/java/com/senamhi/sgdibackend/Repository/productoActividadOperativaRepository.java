package com.senamhi.sgdibackend.Repository;

import com.senamhi.sgdibackend.Entity.productoActividadOperativa;
import com.senamhi.sgdibackend.Entity.view.viewProductoAO;


import netscape.javascript.JSObject;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public interface productoActividadOperativaRepository extends JpaRepository<productoActividadOperativa, Integer> {
    List<productoActividadOperativa> findByIdAOUnidadOrderByIdAOUnidadDesc(Integer id);


    @Query("SELECT u, a  FROM productoActividadOperativa u " +
            "inner join actividadOperativaUnidad a on a.idAOUnidad=u.idAOUnidad WHERE a.nombreUnidad=?1")
    List<viewProductoAO> listarProductoAO(String nombreUnidad);
}
