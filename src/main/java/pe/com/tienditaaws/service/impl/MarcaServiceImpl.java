package pe.com.tienditaaws.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.tienditaaws.entity.MarcaEntity;
import pe.com.tienditaaws.repository.MarcaRepository;
import pe.com.tienditaaws.service.MarcaService;

@Service
public class MarcaServiceImpl implements MarcaService {

	@Autowired
	private MarcaRepository repositorio;
	
	@Override
	public List<MarcaEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<MarcaEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public MarcaEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public MarcaEntity findByName(String name) {
		return repositorio.findByName(name);
	}

	@Override
	public MarcaEntity add(MarcaEntity m) {
		return repositorio.save(m);
	}

	@Override
	public MarcaEntity update(MarcaEntity c, Long id) {
		MarcaEntity obj=repositorio.findById(id).get();
		BeanUtils.copyProperties(c, obj);
		return repositorio.save(obj);
	}

	@Override
	public MarcaEntity delete(Long id) {
		MarcaEntity obj=repositorio.findById(id).get();
		obj.setEstado(false);
		return repositorio.save(obj);
	}

	@Override
	public MarcaEntity enable(Long id) {
		MarcaEntity obj=repositorio.findById(id).get();
		obj.setEstado(true);
		return repositorio.save(obj);
	}

}