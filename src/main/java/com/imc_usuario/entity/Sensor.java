
package com.imc_usuario.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "sensor")
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_sensor;  
    @NotNull
    private Double longitud;
    @NotNull
    private Double ancho;
    private Integer cant_sensores;
    private Double sepa_pared;
    private Double sepa_sensor;
}
