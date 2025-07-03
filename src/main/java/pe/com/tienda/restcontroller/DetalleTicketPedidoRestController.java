package pe.com.tienda.restcontroller;

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

import pe.com.tienda.entity.DetalleTicketPedidoEntity;
import pe.com.tienda.service.DetalleTicketPedidoService;

@RestController
@RequestMapping("/detalleticketpedido")

public class DetalleTicketPedidoRestController {

	@Autowired
    private DetalleTicketPedidoService servicio;

    @GetMapping
    public List<DetalleTicketPedidoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<DetalleTicketPedidoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public DetalleTicketPedidoEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @PostMapping
    public DetalleTicketPedidoEntity add(@RequestBody DetalleTicketPedidoEntity dt) {
        return servicio.add(dt);
    }

    @PutMapping("/{id}")
    public DetalleTicketPedidoEntity update(@RequestBody DetalleTicketPedidoEntity dt, @PathVariable long id) {
        return servicio.update(dt, id);
    }

    @DeleteMapping("/{id}")
    public DetalleTicketPedidoEntity delete(@PathVariable long id) {
        return servicio.delete(id);
    }

    @PutMapping("/enable/{id}")
    public DetalleTicketPedidoEntity enable(@PathVariable long id) {
        return servicio.enable(id);
    }
}
