package pe.com.tienda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.com.tienda.entity.MarcaEntity;

public interface MarcaRepository extends JpaRepository<MarcaEntity, Long> {
	@Query("select m from MarcaEntity m where m.estado=true")
	List<MarcaEntity> findAllCustom();
	
	@Query("select m from MarcaEntity m where LOWER(m.nombre) like LOWER(CONCAT('%', :nombre,'%'))")
	MarcaEntity findByName(@Param("nombre") String nombre);
}
