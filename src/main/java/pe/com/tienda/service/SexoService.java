package pe.com.tienda.service;

import java.util.List;

import pe.com.tienda.entity.SexoEntity;

public interface SexoService {
    List<SexoEntity> findAll();
    List<SexoEntity> findAllCustom();
    SexoEntity findById(Long id);
    SexoEntity findByName(String name);
    SexoEntity add(SexoEntity s);
    SexoEntity update(SexoEntity s, Long id);
    SexoEntity delete(Long id);
    SexoEntity enable(Long id);
}