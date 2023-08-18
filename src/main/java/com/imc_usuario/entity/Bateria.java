package com.imc_usuario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "bateria")
public class Bateria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_bateria;
    @NotEmpty
    private String nombre;
//    @NotNull
//    private Integer cantidad;
    @NotNull
    private Double corri_espera;
    @NotNull
    private Double corri_alarma;
//    private Double total_corri_espera;
//    private Double total_corri_alarma;
    
}
