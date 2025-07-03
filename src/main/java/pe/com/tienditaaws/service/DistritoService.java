package pe.com.tienditaaws.service;

import java.util.List;
import pe.com.tienditaaws.entity.DistritoEntity;

public interface DistritoService {

	List<DistritoEntity> findAll();
	List<DistritoEntity> findAllCustom();
	DistritoEntity findById(Long id);
	DistritoEntity findByName(String name);
	DistritoEntity add(DistritoEntity d);
	DistritoEntity update(DistritoEntity d, Long id);
	DistritoEntity delete(Long id);
	DistritoEntity enable(Long id);
	
}
