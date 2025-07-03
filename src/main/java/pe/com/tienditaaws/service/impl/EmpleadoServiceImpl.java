package pe.com.tienditaaws.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tienditaaws.entity.EmpleadoEntity;
import pe.com.tienditaaws.repository.EmpleadoRepository;
import pe.com.tienditaaws.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoRepository repositorio;
	
	@Override
	public List<EmpleadoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<EmpleadoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public EmpleadoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public EmpleadoEntity findByName(String name) {
		return repositorio.findByName(name);
	}

	@Override
	public EmpleadoEntity add(EmpleadoEntity e) {
		return repositorio.save(e);
	}

	@Override
	public EmpleadoEntity update(EmpleadoEntity e, Long id) {
		EmpleadoEntity obj=repositorio.findById(id).get();
		BeanUtils.copyProperties(e, obj);
		return repositorio.save(obj);
	}

	@Override
	public EmpleadoEntity delete(Long id) {
		EmpleadoEntity obj=repositorio.findById(id).get();
		obj.setEstado(false);
		return repositorio.save(obj);
	}

	@Override
	public EmpleadoEntity enable(Long id) {
		EmpleadoEntity obj=repositorio.findById(id).get();
		obj.setEstado(true);
		return repositorio.save(obj);
	}

}