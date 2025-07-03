package pe.com.tienditaaws.service;

import java.util.List;

import pe.com.tienditaaws.entity.DetalleTicketPedidoEntity;

public interface DetalleTicketPedidoService {
	
	List<DetalleTicketPedidoEntity> findAll();
    List<DetalleTicketPedidoEntity> findAllCustom();
    DetalleTicketPedidoEntity findById(Long id);
    DetalleTicketPedidoEntity add(DetalleTicketPedidoEntity dt);
    DetalleTicketPedidoEntity update(DetalleTicketPedidoEntity dt, Long id);
    DetalleTicketPedidoEntity delete(Long id);
    DetalleTicketPedidoEntity enable(Long id);
}
