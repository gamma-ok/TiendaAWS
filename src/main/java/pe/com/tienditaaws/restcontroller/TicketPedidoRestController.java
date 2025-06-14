package pe.com.tienditaaws.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.com.tienditaaws.entity.TicketPedidoEntity;
import pe.com.tienditaaws.service.TicketPedidoService;

@RestController
@RequestMapping("/ticketpedido")
public class TicketPedidoRestController {

    @Autowired
    private TicketPedidoService servicio;

    @GetMapping
    public List<TicketPedidoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<TicketPedidoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public TicketPedidoEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public TicketPedidoEntity add(@RequestBody TicketPedidoEntity t) {
        return servicio.add(t);
    }

    @PutMapping("/{id}")
    public TicketPedidoEntity update(@RequestBody TicketPedidoEntity t, @PathVariable long id) {
        return servicio.update(t, id);
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
