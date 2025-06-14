package pe.com.tienditaaws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.com.tienditaaws.entity.TipoDocumentoEntity;

public interface TipoDocumentoRepository extends JpaRepository<TipoDocumentoEntity, Long> {
    
    @Query("select t from TipoDocumentoEntity t where t.estado=true")
    List<TipoDocumentoEntity> findAllCustom();
    
    @Query("select t from TipoDocumentoEntity t where LOWER(t.nombre) like LOWER(CONCAT('%', :nombre, '%'))")
    TipoDocumentoEntity findByName(@Param("nombre") String nombre);
}
