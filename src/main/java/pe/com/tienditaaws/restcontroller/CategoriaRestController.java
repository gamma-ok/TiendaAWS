package pe.com.tienditaaws.restcontroller;

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
import pe.com.tienditaaws.entity.CategoriaEntity;
import pe.com.tienditaaws.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaRestController {
	//inyeccion de dependencia
	@Autowired
	private CategoriaService servicio;
	
	//@GetMapping -> Consultas y Busquedas
	//@PostMapping -> Registro
	//@PutMappaing -> Actualizar
	//@DeleteMapping -> Eliminar
	
	@GetMapping
	public List<CategoriaEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<CategoriaEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public CategoriaEntity findById(@PathVariable long id) {
		return servicio.findById(id);
	}
	
	@GetMapping("/name/{name}")
	public CategoriaEntity findByName(@PathVariable String name) {
		return servicio.findByName(name);
	}
	
	@PostMapping
	public CategoriaEntity add(@RequestBody CategoriaEntity c) {
		return servicio.add(c);
	}
	
	@PutMapping("/{id}")
	public CategoriaEntity update(@RequestBody CategoriaEntity c,@PathVariable long id) {
		return servicio.update(c, id);
	}
	
	@DeleteMapping("/{id}")
	public CategoriaEntity delete(@PathVariable long id) {
		return servicio.delete(id);
	}
	
	@PutMapping("/enable/{id}")
	public CategoriaEntity enable(@PathVariable long id) {
		return servicio.enable(id);
	}
}