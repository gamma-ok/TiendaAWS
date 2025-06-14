package pe.com.tienditaaws.service;

import java.util.List;
import pe.com.tienditaaws.entity.TicketPedidoEntity;

public interface TicketPedidoService {
    List<TicketPedidoEntity> findAll();
    List<TicketPedidoEntity> findAllCustom();
    TicketPedidoEntity findById(Long id);
    TicketPedidoEntity findByName(String name);
    TicketPedidoEntity add(TicketPedidoEntity t);
    TicketPedidoEntity update(TicketPedidoEntity t, Long id);
    TicketPedidoEntity delete(Long id);
    TicketPedidoEntity enable(Long id);
}
