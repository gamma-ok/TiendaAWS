package pe.com.tienda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.com.tienda.entity.DistritoEntity;

public interface DistritoRepository extends JpaRepository<DistritoEntity, Long> {
	@Query("select d from DistritoEntity d where d.estado=true")
	List<DistritoEntity> findAllCustom();
	
	@Query("select d from DistritoEntity d where LOWER(d.nombre) like LOWER(CONCAT('%', :nombre,'%'))")
	DistritoEntity findByName(@Param("nombre") String nombre);
}
