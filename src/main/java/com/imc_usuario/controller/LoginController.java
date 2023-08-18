package com.imc_usuario.controller;

import com.imc_usuario.entity.Usuario;
import com.imc_usuario.repo.UsuarioRepo;
import com.imc_usuario.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class LoginController {

    @Autowired
    private UsuarioService usuarioservice;

    @GetMapping
    public List<Usuario> listar() {
        return usuarioservice.listar();
    }

    @PostMapping
    public Usuario insertar(@RequestBody Usuario emp) {
        return usuarioservice.insertar(emp);
    }

    @PutMapping
    public Usuario actualizar(@RequestBody Usuario emp) {
        return usuarioservice.actualizar(emp);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Usuario emp) {
        usuarioservice.eliminar(emp);
    }

    @PostMapping("/verificarLogin")
    public Optional<Usuario> verificarLogin(@RequestBody Map<String, String> data, HttpSession session) {
        String nick = data.get("nick");
        String password = data.get("password");
        Optional<Usuario> usuario = usuarioservice.verificarCredenciales(nick, password);

        if (usuario.isPresent()) {
            // Usuario autenticado con éxito, establecer el nombre de usuario en la sesión
            session.setAttribute("nombreUsuario", usuario.get().getNick());
        }
        return usuario;
    }

}
