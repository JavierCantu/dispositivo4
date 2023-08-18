package com.imc_usuario.repo;

import com.imc_usuario.entity.Bateria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BateriaRepo extends JpaRepository<Bateria, Integer> {

}
