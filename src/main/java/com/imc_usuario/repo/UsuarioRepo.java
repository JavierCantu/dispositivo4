package com.imc_usuario.repo;

import com.imc_usuario.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByNick(String nick);

    Optional<Usuario> findByNickAndPassword(String nick, String password);
    
        


}
