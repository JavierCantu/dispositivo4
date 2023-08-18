package com.imc_usuario.controller;

import com.imc_usuario.entity.Sensor;
import com.imc_usuario.entity.Usuario;
import com.imc_usuario.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioservice;

    @GetMapping("/")
    public String greeting() {
        return "login"; // Reemplaza "login" con la ruta de tu página de inicio de sesión
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

    @GetMapping("/sensores")
    public String anexarSensores(Sensor sensor) {
        return "sensores";
    }

    @GetMapping("/baterias")
    public String anexarBaterias(Model model, HttpSession session) {
        String nickUsuario = (String) session.getAttribute("nombreUsuario");

        // Puedes agregar otros datos que necesites al modelo
        model.addAttribute("nickUsuario", nickUsuario);
        return "bateria";
    }

    @GetMapping("/calculadora")
    public String anexarCalculadora(Model model) {
        return "calculadora";
    }

    @GetMapping("/cerrar-sesion")
    public String cerrarSesion(HttpSession session) {
        // Eliminar la variable de sesión "nombreUsuario"
        session.removeAttribute("nickUsuario");

        // Invalidar la sesión para cerrarla y eliminar todas las variables de sesión
        session.invalidate();

        // Redirigir al usuario a la página de inicio de sesión
        return "login"; // Reemplaza "login" con la ruta de tu página de inicio de sesión
    }
}
