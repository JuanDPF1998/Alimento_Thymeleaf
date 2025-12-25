package com.thymeleaft.Repositorio;

import com.thymeleaft.modelo.AlimentosModelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlimentosRepositorio extends JpaRepository<AlimentosModelo, Long> {
}
