package pe.com.tienda.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.tienda.entity.ProductoEntity;
import pe.com.tienda.repository.ProductoRepository;
import pe.com.tienda.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repositorio;
	
	@Override
	public List<ProductoEntity> findAll() {
		return repositorio.findAll();
	}

	@Override
	public List<ProductoEntity> findAllCustom() {
		return repositorio.findAllCustom();
	}

	@Override
	public ProductoEntity findById(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public ProductoEntity findByName(String name) {
		return repositorio.findByName(name);
	}

	@Override
	public ProductoEntity add(ProductoEntity p) {
		return repositorio.save(p);
	}

	@Override
	public ProductoEntity update(ProductoEntity p, Long id) {
		ProductoEntity obj=repositorio.findById(id).get();
		BeanUtils.copyProperties(p, obj);
		return repositorio.save(obj);
	}

	@Override
	public ProductoEntity delete(Long id) {
		ProductoEntity obj=repositorio.findById(id).get();
		obj.setEstado(false);
		return repositorio.save(obj);
	}

	@Override
	public ProductoEntity enable(Long id) {
		ProductoEntity obj=repositorio.findById(id).get();
		obj.setEstado(true);
		return repositorio.save(obj);
	}

}