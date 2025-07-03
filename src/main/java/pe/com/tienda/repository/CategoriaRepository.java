package pe.com.tienda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.com.tienda.entity.CategoriaEntity;

public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {
	@Query("select c from CategoriaEntity c where c.estado=true")
	List<CategoriaEntity> findAllCustom();
	
	@Query("select c from CategoriaEntity c where LOWER(c.nombre) like LOWER(CONCAT('%', :nombre,'%'))")
	CategoriaEntity findByName(@Param("nombre") String nombre);
}