package pe.com.tienda.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.tienda.entity.DetalleTicketPedidoEntity;

public interface DetalleTicketPedidoRepository extends JpaRepository<DetalleTicketPedidoEntity, Long>{
	@Query("select dt from DetalleTicketPedidoEntity dt where dt.estado = true")
    List<DetalleTicketPedidoEntity> findAllCustom();
}
