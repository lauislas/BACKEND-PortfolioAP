package com.portfolio.ArgentinaPrograma.security.service;

import com.portfolio.ArgentinaPrograma.security.entity.Usuario;
import com.portfolio.ArgentinaPrograma.security.repository.UsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepo;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return usuarioRepo.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario) {
        return usuarioRepo.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String email) {
        return usuarioRepo.existsByEmail(email);
    }

    public void save(Usuario usuario) {
        usuarioRepo.save(usuario);
    }
}
