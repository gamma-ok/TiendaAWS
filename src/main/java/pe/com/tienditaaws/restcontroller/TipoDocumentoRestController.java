package pe.com.tienditaaws.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.com.tienditaaws.entity.TipoDocumentoEntity;
import pe.com.tienditaaws.service.TipoDocumentoService;

@RestController
@RequestMapping("/tipodocumento")
public class TipoDocumentoRestController {

    @Autowired
    private TipoDocumentoService servicio;

    @GetMapping
    public List<TipoDocumentoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<TipoDocumentoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public TipoDocumentoEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @GetMapping("/name/{name}")
    public TipoDocumentoEntity findByName(@PathVariable String name) {
        return servicio.findByName(name);
    }

    @PostMapping
    public TipoDocumentoEntity add(@RequestBody TipoDocumentoEntity t) {
        return servicio.add(t);
    }

    @PutMapping("/{id}")
    public TipoDocumentoEntity update(@RequestBody TipoDocumentoEntity t, @PathVariable long id) {
        return servicio.update(t, id);
    }

    @DeleteMapping("/{id}")
    public TipoDocumentoEntity delete(@PathVariable long id) {
        return servicio.delete(id);
    }

    @PutMapping("/enable/{id}")
    public TipoDocumentoEntity enable(@PathVariable long id) {
        return servicio.enable(id);
    }
}