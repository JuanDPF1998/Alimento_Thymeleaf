package com.thymeleaft.Repositorio;

import com.thymeleaft.modelo.Alimentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlimentosRepositorio extends JpaRepository<Alimentos, Long> {
}
