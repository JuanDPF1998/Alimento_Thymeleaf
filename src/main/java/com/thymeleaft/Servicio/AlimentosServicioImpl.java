package com.thymeleaft.Servicio;

import com.thymeleaft.Repositorio.IAlimentosRepositorio;
import com.thymeleaft.modelo.AlimentosModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentosServicioImpl implements IAlimentosServicio{

    @Autowired
    private IAlimentosRepositorio alimentosRepositorio;

    @Override
    public List<AlimentosModelo> findAll() {
        return alimentosRepositorio.findAll();
    }
}
