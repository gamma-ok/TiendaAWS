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

import pe.com.tienda.entity.ClienteEntity;
import pe.com.tienda.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {

	@Autowired
	private ClienteService servicio;
	
	@GetMapping
	public List<ClienteEntity> findAll(){
		return servicio.findAll();
	}
	
	@GetMapping("/custom")
	public List<ClienteEntity> findAllCustom(){
		return servicio.findAllCustom();
	}
	
	@GetMapping("/{id}")
	public ClienteEntity findById(@PathVariable long id) {
		return servicio.findById(id);
	}
	
	@GetMapping("/name/{name}")
	public ClienteEntity findByName(@PathVariable String name) {
		return servicio.findByName(name);
	}
	
	@PostMapping
	public ClienteEntity add(@RequestBody ClienteEntity cl) {
		return servicio.add(cl);
	}
	
	@PutMapping("/{id}")
	public ClienteEntity update(@RequestBody ClienteEntity cl,@PathVariable long id) {
		return servicio.update(cl, id);
	}
	
	@DeleteMapping("/{id}")
	public ClienteEntity delete(@PathVariable long id) {
		return servicio.delete(id);
	}
	
	@PutMapping("/enable/{id}")
	public ClienteEntity enable(@PathVariable long id) {
		return servicio.enable(id);
	}
	
	
}
