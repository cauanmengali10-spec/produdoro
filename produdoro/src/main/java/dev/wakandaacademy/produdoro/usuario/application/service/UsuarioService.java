package dev.wakandaacademy.produdoro.usuario.application.service;


import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class UsuarioService implements UsuarioApplicationService{
    @Override
    public UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
        log.info("[start] UsuarioService - postNovoUsuario");
        Usuario usuario = new Usuario(usuarioNovo);
        log.info("[finish] UsuarioService - postNovoUsuario");
        return new UsuarioCriadoResponse(usuario);
    }
}
