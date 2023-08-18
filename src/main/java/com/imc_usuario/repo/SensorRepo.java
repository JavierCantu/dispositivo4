package com.imc_usuario.repo;

import com.imc_usuario.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SensorRepo extends JpaRepository<Sensor, Integer>{
    
}
