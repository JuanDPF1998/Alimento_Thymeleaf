package com.thymeleaft.Servicio;

import com.thymeleaft.Repositorio.AlimentosRepositorio;
import com.thymeleaft.modelo.Alimentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentosServicioImpl implements AlimentosServicio{

    @Autowired
    private AlimentosRepositorio repositorio;

    @Override
    public List<Alimentos> listar() {
        return repositorio.findAll();
    }
}
