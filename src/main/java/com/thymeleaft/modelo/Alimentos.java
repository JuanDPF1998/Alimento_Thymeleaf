package com.thymeleaft.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.Position;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "Alimentos")
public class Alimentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    @Column(name = "precio", nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;
}
