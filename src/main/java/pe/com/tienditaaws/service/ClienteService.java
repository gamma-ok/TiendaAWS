package pe.com.tienditaaws.service;

import java.util.List;
import pe.com.tienditaaws.entity.ClienteEntity;

public interface ClienteService {
	
	List<ClienteEntity> findAll();
	List<ClienteEntity> findAllCustom();
	ClienteEntity findById(Long id);
	ClienteEntity findByName(String name);
	ClienteEntity add(ClienteEntity cl);
	ClienteEntity update(ClienteEntity cl,Long id);
	ClienteEntity delete(Long id);
	ClienteEntity enable(Long id);
}
