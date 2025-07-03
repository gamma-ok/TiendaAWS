package pe.com.tienda.service;

import java.util.List;

import pe.com.tienda.entity.EmpleadoEntity;

public interface EmpleadoService {

	List<EmpleadoEntity> findAll();
	List<EmpleadoEntity> findAllCustom();
	EmpleadoEntity findById(Long id);
	EmpleadoEntity findByName(String name);
	EmpleadoEntity add(EmpleadoEntity e);
	EmpleadoEntity update(EmpleadoEntity e, Long id);
	EmpleadoEntity delete(Long id);
	EmpleadoEntity enable(Long id);

}
