package pe.com.tienda.restcontroller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.tienda.entity.TicketPedidoEntity;
import pe.com.tienda.service.TicketPedidoService;

import org.springframework.format.annotation.DateTimeFormat;

@RestController
@RequestMapping("/ticketpedido")
public class TicketPedidoRestController {
	@Autowired
	private TicketPedidoService servicio;
	
	@GetMapping
	public List<TicketPedidoEntity> findAll(){
		return servicio.findAll();
	}

	@GetMapping("/custom")
	public List<TicketPedidoEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public TicketPedidoEntity findById(@PathVariable long id) {
		return servicio.findById(id);
	}
	
	@GetMapping("/fecha/{fecha}")
	public TicketPedidoEntity findByFecha(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
	    return servicio.findByFecha(fecha);
	}
	
	@PostMapping
	public TicketPedidoEntity add(@RequestBody TicketPedidoEntity tp) {
		return servicio.add(tp);
	}
	
	@PutMapping("/{id}")
	public TicketPedidoEntity update(@RequestBody TicketPedidoEntity tp,@PathVariable long id) {
		return servicio.update(tp, id);
	}
	
	@DeleteMapping("/{id}")
	public TicketPedidoEntity delete(@PathVariable long id) {
		return servicio.delete(id);
	}
		
	@PutMapping("/enable/{id}")
	public TicketPedidoEntity enable(@PathVariable long id) {
		return servicio.enable(id);
	}
	
}
