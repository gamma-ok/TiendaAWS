package pe.com.tienditaaws.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tienditaaws.entity.RolEntity;
import pe.com.tienditaaws.repository.RolRepository;
import pe.com.tienditaaws.service.RolService;

@Service
public class RolServiceImpl implements RolService {

	@Autowired
	private RolRepository repositorio;
	
	@Override
	public List<RolEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<RolEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public RolEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public RolEntity findByName(String name) {
		return repositorio.findByName(name);
	}

	@Override
	public RolEntity add(RolEntity r) {
		return repositorio.save(r);
	}

	@Override
	public RolEntity update(RolEntity r, Long id) {
		RolEntity obj=repositorio.findById(id).get();
		BeanUtils.copyProperties(r, obj);
		return repositorio.save(obj);
	}

	@Override
	public RolEntity delete(Long id) {
		RolEntity obj=repositorio.findById(id).get();
		obj.setEstado(false);
		return repositorio.save(obj);
	}

	@Override
	public RolEntity enable(Long id) {
		RolEntity obj=repositorio.findById(id).get();
		obj.setEstado(true);
		return repositorio.save(obj);
	}

}
