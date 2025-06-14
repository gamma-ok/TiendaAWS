package pe.com.tienditaaws.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tienditaaws.entity.CategoriaEntity;
import pe.com.tienditaaws.repository.CategoriaRepository;
import pe.com.tienditaaws.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	//inyeccion de dependencia
	@Autowired
	private CategoriaRepository repositorio;

	@Override
	public List<CategoriaEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<CategoriaEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public CategoriaEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public CategoriaEntity findByName(String name) {
		return repositorio.findByName(name);
	}

	@Override
	public CategoriaEntity add(CategoriaEntity c) {
		return repositorio.save(c);
	}

	@Override
	public CategoriaEntity update(CategoriaEntity c, Long id) {
		CategoriaEntity obj=repositorio.findById(id).get();
		BeanUtils.copyProperties(c, obj);
		return repositorio.save(obj);
	}

	@Override
	public CategoriaEntity delete(Long id) {
		CategoriaEntity obj=repositorio.findById(id).get();
		obj.setEstado(false);
		return repositorio.save(obj);
	}

	@Override
	public CategoriaEntity enable(Long id) {
		CategoriaEntity obj=repositorio.findById(id).get();
		obj.setEstado(true);
		return repositorio.save(obj);
	}
	
	
}