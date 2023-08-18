package com.imc_usuario.controller;

import com.imc_usuario.entity.Sensor;
import com.imc_usuario.service.SensorService;
import jakarta.validation.Valid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensor")
public class SensorController {

    @Autowired
    private SensorService sensorService;

    @GetMapping
    public List<Sensor> listar() {
        return sensorService.listar();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Sensor> obtenerSensorPorId(@PathVariable Integer id) {
        Sensor sensor = sensorService.obtenerPorId(id);

        if (sensor != null) {
            return ResponseEntity.ok(sensor);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Sensor insertar(@Valid @RequestBody Sensor sensor) {

        return sensorService.insertar(sensor);
    }

    @PutMapping
    public Sensor actualizar(@RequestBody Sensor sensor) {
        return sensorService.actualizar(sensor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        Sensor sensor = new Sensor();
        sensor.setId_sensor(id);
        sensorService.eliminar(sensor);
    }
    

}
