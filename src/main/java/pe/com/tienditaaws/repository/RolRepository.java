package pe.com.tienditaaws.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.tienditaaws.entity.RolEntity;

public interface RolRepository extends JpaRepository<RolEntity, Long> {
	@Query("select r from RolEntity r where r.estado=true")
	List<RolEntity> findAllCustom();
	
	@Query("select r from RolEntity r where LOWER(r.nombre) like LOWER(CONCAT('%', :nombre,'%'))")
	RolEntity findByName(@Param("nombre") String nombre);
}
