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
import pe.com.tienditaaws.entity.DistritoEntity;
import pe.com.tienditaaws.service.DistritoService;

@RestController
@RequestMapping("/distrito")
public class DistritoRestController {
	@Autowired
	private DistritoService servicio;
			
	@GetMapping
	public List<DistritoEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<DistritoEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public DistritoEntity findById(@PathVariable long id) {
		return servicio.findById(id);
	}
	
	@GetMapping("/name/{name}")
	public DistritoEntity findByName(@PathVariable String name) {
		return servicio.findByName(name);
	}
	
	@PostMapping
	public DistritoEntity add(@RequestBody DistritoEntity d) {
		return servicio.add(d);
	}
	
	@PutMapping("/{id}")
	public DistritoEntity update(@RequestBody DistritoEntity d,@PathVariable long id) {
		return servicio.update(d, id);
	}
	
	@DeleteMapping("/{id}")
	public DistritoEntity delete(@PathVariable long id) {
		return servicio.delete(id);
	}
	
	@PutMapping("/enable/{id}")
	public DistritoEntity enable(@PathVariable long id) {
		return servicio.enable(id);
	}
}
