package pe.com.tienda.service;

import java.util.List;

import pe.com.tienda.entity.MarcaEntity;

public interface MarcaService {

	List<MarcaEntity> findAll();
	List<MarcaEntity> findAllCustom();
	MarcaEntity findById(Long id);
	MarcaEntity findByName(String name);
	MarcaEntity add(MarcaEntity m);
	MarcaEntity update(MarcaEntity c, Long id);
	MarcaEntity delete(Long id);
	MarcaEntity enable(Long id);
	
}
