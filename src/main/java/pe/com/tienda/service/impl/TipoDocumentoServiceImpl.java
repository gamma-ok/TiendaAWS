package pe.com.tienda.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.tienda.entity.TipoDocumentoEntity;
import pe.com.tienda.repository.TipoDocumentoRepository;
import pe.com.tienda.service.TipoDocumentoService;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService {

    @Autowired
    private TipoDocumentoRepository repositorio;

    @Override
    public List<TipoDocumentoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<TipoDocumentoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public TipoDocumentoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public TipoDocumentoEntity findByName(String name) {
        return repositorio.findByName(name);
    }

    @Override
    public TipoDocumentoEntity add(TipoDocumentoEntity t) {
        return repositorio.save(t);
    }

    @Override
    public TipoDocumentoEntity update(TipoDocumentoEntity t, Long id) {
        TipoDocumentoEntity obj = repositorio.findById(id).get();
        BeanUtils.copyProperties(t, obj);
        return repositorio.save(obj);
    }

    @Override
    public TipoDocumentoEntity delete(Long id) {
        TipoDocumentoEntity obj = repositorio.findById(id).get();
        obj.setEstado(false);
        return repositorio.save(obj);
    }

    @Override
    public TipoDocumentoEntity enable(Long id) {
        TipoDocumentoEntity obj = repositorio.findById(id).get();
        obj.setEstado(true);
        return repositorio.save(obj);
    }
}