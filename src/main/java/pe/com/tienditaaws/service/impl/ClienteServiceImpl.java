package pe.com.tienditaaws.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tienditaaws.entity.ClienteEntity;
import pe.com.tienditaaws.repository.ClienteRepository;
import pe.com.tienditaaws.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository repositorio;
	
	@Override
	public List<ClienteEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<ClienteEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public ClienteEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public ClienteEntity findByName(String name) {
		return repositorio.findByName(name);
	}

	@Override
	public ClienteEntity add(ClienteEntity cl) {
		return repositorio.save(cl);
	}

	@Override
	public ClienteEntity update(ClienteEntity cl, Long id) {
		ClienteEntity obj=repositorio.findById(id).get();
		BeanUtils.copyProperties(cl, obj);
		return repositorio.save(obj);
	}

	@Override
	public ClienteEntity delete(Long id) {
		ClienteEntity obj=repositorio.findById(id).get();
		obj.setEstado(false);
		return repositorio.save(obj);
	}

	@Override
	public ClienteEntity enable(Long id) {
		ClienteEntity obj=repositorio.findById(id).get();
		obj.setEstado(true);
		return repositorio.save(obj);
	}
	
}
