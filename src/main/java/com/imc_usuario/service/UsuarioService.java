
package com.imc_usuario.service;

import com.imc_usuario.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.imc_usuario.repo.UsuarioRepo;
import java.util.Optional;

@Service
public class UsuarioService{
    
    @Autowired
    private UsuarioRepo usuariorepo;

    
    public Usuario insertar(Usuario emp){
        return usuariorepo.save(emp);
    }
    
    public Usuario actualizar(Usuario emp){
        return usuariorepo.save(emp);
    }
    
    public List<Usuario> listar(){
        return usuariorepo.findAll();
    }
    
    public void eliminar(Usuario emp){
        usuariorepo.delete(emp);
    }
    
    public Optional<Usuario> obtenerPorId(Integer id) {
        return usuariorepo.findById(id);
    }
    public boolean verificarExistenciaPorNick(String nick) {
        // Realiza la consulta en la base de datos para verificar si el nick ya existe
        Optional<Usuario> usuarioOptional = usuariorepo.findByNick(nick);
        return usuarioOptional.isPresent();
    }
    
    public Optional<Usuario> verificarCredenciales(String nick, String password) {
        // Realiza la consulta en la base de datos para verificar las credenciales del usuario
        return usuariorepo.findByNickAndPassword(nick, password);
    }
//    public Optional<Usuario> obtenerPorNick(String nick) {
//        return usuariorepo.findByNick(nick);
//    }
    public Optional<Usuario> obtenerPorNick(String nick) {
        return usuariorepo.findByNick(nick);
    }
}
