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
import pe.com.tienditaaws.entity.EmpleadoEntity;
import pe.com.tienditaaws.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoRestController {
	@Autowired
	private EmpleadoService servicio;
			
	@GetMapping
	public List<EmpleadoEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<EmpleadoEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public EmpleadoEntity findById(@PathVariable long id) {
		return servicio.findById(id);
	}
	
	@GetMapping("/name/{name}")
	public EmpleadoEntity findByName(@PathVariable String name) {
		return servicio.findByName(name);
	}
	
	@PostMapping
	public EmpleadoEntity add(@RequestBody EmpleadoEntity e) {
		return servicio.add(e);
	}
	
	@PutMapping("/{id}")
	public EmpleadoEntity update(@RequestBody EmpleadoEntity e,@PathVariable long id) {
		return servicio.update(e, id);
	}
	
	@DeleteMapping("/{id}")
	public EmpleadoEntity delete(@PathVariable long id) {
		return servicio.delete(id);
	}
	
	@PutMapping("/enable/{id}")
	public EmpleadoEntity enable(@PathVariable long id) {
		return servicio.enable(id);
	}
}