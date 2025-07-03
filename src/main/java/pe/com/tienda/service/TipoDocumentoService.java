package pe.com.tienda.service;

import java.util.List;

import pe.com.tienda.entity.TipoDocumentoEntity;

public interface TipoDocumentoService {
    List<TipoDocumentoEntity> findAll();
    List<TipoDocumentoEntity> findAllCustom();
    TipoDocumentoEntity findById(Long id);
    TipoDocumentoEntity findByName(String name);
    TipoDocumentoEntity add(TipoDocumentoEntity t);
    TipoDocumentoEntity update(TipoDocumentoEntity t, Long id);
    TipoDocumentoEntity delete(Long id);
    TipoDocumentoEntity enable(Long id);
}