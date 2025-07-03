package pe.com.tienditaaws.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tienditaaws.entity.DetalleTicketPedidoEntity;
import pe.com.tienditaaws.entity.ProductoEntity;
import pe.com.tienditaaws.entity.TicketPedidoEntity;
import pe.com.tienditaaws.repository.DetalleTicketPedidoRepository;
import pe.com.tienditaaws.repository.ProductoRepository;
import pe.com.tienditaaws.repository.TicketPedidoRepository;
import pe.com.tienditaaws.service.DetalleTicketPedidoService;

@Service
public class DetalleTicketPedidoServiceImpl implements DetalleTicketPedidoService {

    @Autowired
    private DetalleTicketPedidoRepository repositorio;

    @Autowired
    private TicketPedidoRepository ticketPedidoRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<DetalleTicketPedidoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<DetalleTicketPedidoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public DetalleTicketPedidoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public DetalleTicketPedidoEntity add(DetalleTicketPedidoEntity dt) {
        Long numero = dt.getTicketpedido().getNumero();
        TicketPedidoEntity ticket = ticketPedidoRepository.findById(numero)
            .orElseThrow(() -> new RuntimeException("TicketPedido no encontrado"));
        
        Long productoId = dt.getProducto().getCodigo();
        ProductoEntity producto = productoRepository.findById(productoId)
            .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        
        dt.setTicketpedido(ticket);
        dt.setProducto(producto);

        return repositorio.save(dt);
    }

    @Override
    public DetalleTicketPedidoEntity update(DetalleTicketPedidoEntity dt, Long id) {
        DetalleTicketPedidoEntity obj = repositorio.findById(id).get();
        BeanUtils.copyProperties(dt, obj);
        return repositorio.save(obj);
    }

    @Override
    public DetalleTicketPedidoEntity delete(Long id) {
        DetalleTicketPedidoEntity obj = repositorio.findById(id).get();
        obj.setEstado(false);
        return repositorio.save(obj);
    }

    @Override
    public DetalleTicketPedidoEntity enable(Long id) {
        DetalleTicketPedidoEntity obj = repositorio.findById(id).get();
        obj.setEstado(true);
        return repositorio.save(obj);
    }
}
