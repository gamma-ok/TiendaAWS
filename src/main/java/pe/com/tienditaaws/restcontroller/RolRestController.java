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
import pe.com.tienditaaws.entity.RolEntity;
import pe.com.tienditaaws.service.RolService;

@RestController
@RequestMapping("/rol")
public class RolRestController {
	@Autowired
	private RolService servicio;
			
	@GetMapping
	public List<RolEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<RolEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public RolEntity findById(@PathVariable long id) {
		return servicio.findById(id);
	}
	
	@GetMapping("/name/{name}")
	public RolEntity findByName(@PathVariable String name) {
		return servicio.findByName(name);
	}
	
	@PostMapping
	public RolEntity add(@RequestBody RolEntity r) {
		return servicio.add(r);
	}
	
	@PutMapping("/{id}")
	public RolEntity update(@RequestBody RolEntity r,@PathVariable long id) {
		return servicio.update(r, id);
	}
	
	@DeleteMapping("/{id}")
	public RolEntity delete(@PathVariable long id) {
		return servicio.delete(id);
	}
	
	@PutMapping("/enable/{id}")
	public RolEntity enable(@PathVariable long id) {
		return servicio.enable(id);
	}
}
