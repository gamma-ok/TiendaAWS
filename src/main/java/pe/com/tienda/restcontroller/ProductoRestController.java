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

import pe.com.tienda.entity.ProductoEntity;
import pe.com.tienda.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {
	@Autowired
	private ProductoService servicio;
			
	@GetMapping
	public List<ProductoEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<ProductoEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public ProductoEntity findById(@PathVariable long id) {
		return servicio.findById(id);
	}
	
	@GetMapping("/name/{name}")
	public ProductoEntity findByName(@PathVariable String name) {
		return servicio.findByName(name);
	}
	
	@PostMapping
	public ProductoEntity add(@RequestBody ProductoEntity p) {
		return servicio.add(p);
	}
	
	@PutMapping("/{id}")
	public ProductoEntity update(@RequestBody ProductoEntity p,@PathVariable long id) {
		return servicio.update(p, id);
	}
	
	@DeleteMapping("/{id}")
	public ProductoEntity delete(@PathVariable long id) {
		return servicio.delete(id);
	}
	
	@PutMapping("/enable/{id}")
	public ProductoEntity enable(@PathVariable long id) {
		return servicio.enable(id);
	}
}