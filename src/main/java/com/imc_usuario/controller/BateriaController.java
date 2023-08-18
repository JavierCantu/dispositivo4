package com.imc_usuario.controller;

import com.imc_usuario.entity.Bateria;
import com.imc_usuario.service.BateriaService;
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
@RequestMapping("/bateria")
public class BateriaController {

    @Autowired
    private BateriaService bateriaService;

    @GetMapping
    public List<Bateria> listar() {
        return bateriaService.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bateria> obtenerBateriaPorId(@PathVariable Integer id) {
        Bateria bateria = bateriaService.obtenerPorId(id);
        if (bateria != null) {
            return ResponseEntity.ok(bateria);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Bateria insertar(@Valid @RequestBody Bateria bateria) {

        return bateriaService.insertar(bateria);
    }

    @PutMapping
    public Bateria actualizar(@RequestBody Bateria bateria) {
        return bateriaService.actualizar(bateria);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        Bateria bateria = new Bateria();
        bateria.setId_bateria(id);
        bateriaService.eliminar(bateria);
    }

}
