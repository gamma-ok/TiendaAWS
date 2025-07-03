package pe.com.tienditaaws.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.tienditaaws.entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long>{

	@Query("select cl from ClienteEntity cl where cl.estado=true")
	List<ClienteEntity> findAllCustom();
	
	@Query("select cl from ClienteEntity cl where LOWER(cl.nombre) like LOWER(CONCAT('%', :nombre,'%'))")
	ClienteEntity findByName(@Param("nombre") String nombre);
	
}
