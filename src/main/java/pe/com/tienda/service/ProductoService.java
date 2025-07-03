package pe.com.tienda.service;

import java.util.List;

import pe.com.tienda.entity.ProductoEntity;

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
