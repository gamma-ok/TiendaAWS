package pe.com.tienditaaws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.com.tienditaaws.entity.SexoEntity;

public interface SexoRepository extends JpaRepository<SexoEntity, Long> {
    
    @Query("select s from SexoEntity s where s.estado=true")
    List<SexoEntity> findAllCustom();
    
    @Query("select s from SexoEntity s where LOWER(s.nombre) like LOWER(CONCAT('%', :nombre, '%'))")
    SexoEntity findByName(@Param("nombre") String nombre);
}
