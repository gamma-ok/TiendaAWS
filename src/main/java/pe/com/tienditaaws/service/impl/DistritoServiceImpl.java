package pe.com.tienditaaws.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tienditaaws.entity.DistritoEntity;
import pe.com.tienditaaws.repository.DistritoRepository;
import pe.com.tienditaaws.service.DistritoService;

@Service
public class DistritoServiceImpl implements DistritoService {

	@Autowired
	private DistritoRepository repositorio;
	
	@Override
	public List<DistritoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<DistritoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public DistritoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public DistritoEntity findByName(String name) {
		return repositorio.findByName(name);
	}

	@Override
	public DistritoEntity add(DistritoEntity d) {
		return repositorio.save(d);
	}

	@Override
	public DistritoEntity update(DistritoEntity d, Long id) {
		DistritoEntity obj=repositorio.findById(id).get();
		BeanUtils.copyProperties(d, obj);
		return repositorio.save(obj);
	}

	@Override
	public DistritoEntity delete(Long id) {
		DistritoEntity obj=repositorio.findById(id).get();
		obj.setEstado(false);
		return repositorio.save(obj);
	}

	@Override
	public DistritoEntity enable(Long id) {
		DistritoEntity obj=repositorio.findById(id).get();
		obj.setEstado(true);
		return repositorio.save(obj);
	}

}
