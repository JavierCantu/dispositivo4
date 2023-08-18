package com.imc_usuario.service;

import com.imc_usuario.entity.Sensor;
import com.imc_usuario.repo.SensorRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorService {
    @Autowired
    private SensorRepo sensorRepo;
    
    public Sensor insertar(Sensor sensor){
        return sensorRepo.save(sensor);
    }
    public Sensor actualizar(Sensor sensor){
        return sensorRepo.save(sensor);
    }
    public List<Sensor> listar(){
        return sensorRepo.findAll();
    }
    public void eliminar(Sensor sensor) {
        sensorRepo.delete(sensor);
    }
    public Sensor obtenerPorId(Integer id) {
        return sensorRepo.findById(id).orElse(null);
    }
    
}
