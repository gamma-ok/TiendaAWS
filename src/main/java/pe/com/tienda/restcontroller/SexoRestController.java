package pe.com.tienda.restcontroller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.com.tienda.entity.SexoEntity;
import pe.com.tienda.service.SexoService;

@RestController
@RequestMapping("/sexo")
public class SexoRestController {

    @Autowired
    private SexoService servicio;

    @GetMapping
    public List<SexoEntity> findAll() {
        return servicio.findAll();
    }

    @GetMapping("/custom")
    public List<SexoEntity> findAllCustom() {
        return servicio.findAllCustom();
    }

    @GetMapping("/{id}")
    public SexoEntity findById(@PathVariable long id) {
        return servicio.findById(id);
    }

    @GetMapping("/name/{name}")
    public SexoEntity findByName(@PathVariable String name) {
        return servicio.findByName(name);
    }

    @PostMapping
    public SexoEntity add(@RequestBody SexoEntity s) {
        return servicio.add(s);
    }

    @PutMapping("/{id}")
    public SexoEntity update(@RequestBody SexoEntity s, @PathVariable long id) {
        return servicio.update(s, id);
    }

    @DeleteMapping("/{id}")
    public SexoEntity delete(@PathVariable long id) {
        return servicio.delete(id);
    }

    @PutMapping("/enable/{id}")
    public SexoEntity enable(@PathVariable long id) {
        return servicio.enable(id);
    }
}