package com.thymeleaft.Servicio;

import com.thymeleaft.modelo.AlimentosModelo;

import java.util.List;

public interface IAlimentosServicio {
    public List<AlimentosModelo> findAll();
}
