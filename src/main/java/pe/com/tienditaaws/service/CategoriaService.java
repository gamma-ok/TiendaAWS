package pe.com.tienditaaws.service;

import java.util.List;

import pe.com.tienditaaws.entity.CategoriaEntity;

public interface CategoriaService {

	List<CategoriaEntity> findAll();
	List<CategoriaEntity> findAllCustom();
	CategoriaEntity findById(Long id);
	CategoriaEntity findByName(String name);
	CategoriaEntity add(CategoriaEntity c);
	CategoriaEntity update(CategoriaEntity c, Long id);
	CategoriaEntity delete(Long id);
	CategoriaEntity enable(Long id);

}
