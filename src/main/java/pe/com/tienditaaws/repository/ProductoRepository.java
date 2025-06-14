package pe.com.tienditaaws.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.tienditaaws.entity.ProductoEntity;


public interface ProductoRepository extends JpaRepository<ProductoEntity, Long> {
	@Query("select p from ProductoEntity p where p.estado=true")
	List<ProductoEntity> findAllCustom();
	
	@Query("select p from ProductoEntity p where LOWER(p.nombre) like LOWER(CONCAT('%', :nombre,'%'))")
	ProductoEntity findByName(@Param("nombre") String nombre);
}