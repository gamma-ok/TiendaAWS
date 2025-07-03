package pe.com.tienda.service;

import java.time.LocalDate;
import java.util.List;

import pe.com.tienda.entity.TicketPedidoEntity;

public interface TicketPedidoService {
	
	List<TicketPedidoEntity> findAll();
	List<TicketPedidoEntity> findAllCustom();
	TicketPedidoEntity findById(Long id);
	TicketPedidoEntity findByFecha(LocalDate fecha);
	TicketPedidoEntity add(TicketPedidoEntity tp);
	TicketPedidoEntity update(TicketPedidoEntity tp, Long id);
	TicketPedidoEntity delete(Long id);
	TicketPedidoEntity enable(Long id);
}