package pe.com.tienditaaws.service.impl;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tienditaaws.entity.TicketPedidoEntity;
import pe.com.tienditaaws.repository.TicketPedidoRepository;
import pe.com.tienditaaws.service.TicketPedidoService;

@Service
public class TicketPedidoServiceImpl implements TicketPedidoService{

	@Autowired
	private TicketPedidoRepository repositorio;
	
	@Override
	public List<TicketPedidoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<TicketPedidoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public TicketPedidoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public TicketPedidoEntity findByFecha(LocalDate fecha) {
		return repositorio.findByFecha(fecha);
	}

	@Override
	public TicketPedidoEntity add(TicketPedidoEntity tp) {
		return repositorio.save(tp);
	}

	@Override
	public TicketPedidoEntity update(TicketPedidoEntity tp, Long id) {
		TicketPedidoEntity obj=repositorio.findById(id).get();
		BeanUtils.copyProperties(tp, obj);
		return repositorio.save(obj);
	}

	@Override
	public TicketPedidoEntity delete(Long id) {
		TicketPedidoEntity obj=repositorio.findById(id).get();
		obj.setEstado(false);
		return repositorio.save(obj);
	}

	@Override
	public TicketPedidoEntity enable(Long id) {
		TicketPedidoEntity obj=repositorio.findById(id).get();
		obj.setEstado(true);
		return repositorio.save(obj);
	}
	
}
