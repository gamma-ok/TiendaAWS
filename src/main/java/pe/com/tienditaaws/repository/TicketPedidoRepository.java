package pe.com.tienditaaws.repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.tienditaaws.entity.TicketPedidoEntity;

public interface TicketPedidoRepository extends JpaRepository<TicketPedidoEntity, Long>{
	@Query("select tp from TicketPedidoEntity tp where tp.estado=true")
	List<TicketPedidoEntity> findAllCustom();
	
	@Query("select tp from TicketPedidoEntity tp where tp.fecha = :fecha")
	TicketPedidoEntity findByFecha(@Param("fecha") LocalDate fecha);

}
