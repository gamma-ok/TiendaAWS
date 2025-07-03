package pe.com.tienda.service;

import java.util.List;

import pe.com.tienda.entity.ClienteEntity;

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
