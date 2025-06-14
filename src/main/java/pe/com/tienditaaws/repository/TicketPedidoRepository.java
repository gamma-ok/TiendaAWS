package pe.com.tienditaaws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.tienditaaws.entity.TicketPedidoEntity;

public interface TicketPedidoRepository extends JpaRepository<TicketPedidoEntity, Long> {

    @Query("select t from TicketPedidoEntity t where t.estado = true")
    List<TicketPedidoEntity> findAllCustom();

}
