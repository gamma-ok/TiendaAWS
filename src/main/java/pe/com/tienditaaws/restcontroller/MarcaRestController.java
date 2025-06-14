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
import pe.com.tienditaaws.entity.MarcaEntity;
import pe.com.tienditaaws.service.MarcaService;

@RestController
@RequestMapping("/marca")
public class MarcaRestController {
	@Autowired
	private MarcaService servicio;
			
	@GetMapping
	public List<MarcaEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<MarcaEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public MarcaEntity findById(@PathVariable long id) {
		return servicio.findById(id);
	}
	
	@GetMapping("/name/{name}")
	public MarcaEntity findByName(@PathVariable String name) {
		return servicio.findByName(name);
	}
	
	@PostMapping
	public MarcaEntity add(@RequestBody MarcaEntity m) {
		return servicio.add(m);
	}
	
	@PutMapping("/{id}")
	public MarcaEntity update(@RequestBody MarcaEntity m,@PathVariable long id) {
		return servicio.update(m, id);
	}
	
	@DeleteMapping("/{id}")
	public MarcaEntity delete(@PathVariable long id) {
		return servicio.delete(id);
	}
	
	@PutMapping("/enable/{id}")
	public MarcaEntity enable(@PathVariable long id) {
		return servicio.enable(id);
	}
}