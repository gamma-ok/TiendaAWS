package pe.com.tienditaaws.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.tienditaaws.entity.SexoEntity;
import pe.com.tienditaaws.repository.SexoRepository;
import pe.com.tienditaaws.service.SexoService;

@Service
public class SexoServiceImpl implements SexoService {

    @Autowired
    private SexoRepository repositorio;

    @Override
    public List<SexoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<SexoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public SexoEntity findById(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public SexoEntity findByName(String name) {
        return repositorio.findByName(name);
    }

    @Override
    public SexoEntity add(SexoEntity s) {
        return repositorio.save(s);
    }

    @Override
    public SexoEntity update(SexoEntity s, Long id) {
        SexoEntity obj = repositorio.findById(id).get();
        BeanUtils.copyProperties(s, obj);
        return repositorio.save(obj);
    }

    @Override
    public SexoEntity delete(Long id) {
        SexoEntity obj = repositorio.findById(id).get();
        obj.setEstado(false);
        return repositorio.save(obj);
    }

    @Override
    public SexoEntity enable(Long id) {
        SexoEntity obj = repositorio.findById(id).get();
        obj.setEstado(true);
        return repositorio.save(obj);
    }
}