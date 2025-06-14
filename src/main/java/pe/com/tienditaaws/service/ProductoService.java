package pe.com.tienditaaws.service;

import java.util.List;

import pe.com.tienditaaws.entity.ProductoEntity;

public interface ProductoService {

	List<ProductoEntity> findAll();
	List<ProductoEntity> findAllCustom();
	ProductoEntity findById(Long id);
	ProductoEntity findByName(String name);
	ProductoEntity add(ProductoEntity p);
	ProductoEntity update(ProductoEntity p, Long id);
	ProductoEntity delete(Long id);
	ProductoEntity enable(Long id);

}
