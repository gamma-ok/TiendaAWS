package pe.com.tienda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.com.tienda.entity.EmpleadoEntity;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> {
	@Query("select e from EmpleadoEntity e where e.estado=true")
	List<EmpleadoEntity> findAllCustom();
	
	@Query("select e from EmpleadoEntity e where LOWER(e.nombre) like LOWER(CONCAT('%', :nombre,'%'))")
	EmpleadoEntity findByName(@Param("nombre") String nombre);
}