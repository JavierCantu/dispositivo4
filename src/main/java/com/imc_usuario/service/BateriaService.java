package com.imc_usuario.service;

import com.imc_usuario.entity.Bateria;
import com.imc_usuario.entity.Sensor;
import com.imc_usuario.repo.BateriaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BateriaService {
    @Autowired
    private BateriaRepo bateriaRepo;
    
    public Bateria insertar(Bateria bateria){
        return bateriaRepo.save(bateria);
    }
    
    public Bateria actualizar(Bateria bateria){
        return bateriaRepo.save(bateria);
    }
    public List<Bateria> listar(){
        return bateriaRepo.findAll();
    }
    public void eliminar(Bateria bateria) {
        bateriaRepo.delete(bateria);
    }   
    
    public Bateria obtenerPorId(Integer id) {
        return bateriaRepo.findById(id).orElse(null);
    }
    
    
}
