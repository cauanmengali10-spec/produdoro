package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.application.service.UsuarioApplicationService;
import dev.wakandaacademy.produdoro.usuario.application.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Log4j2
@Validated
public class UsuarioController implements UsuarioAPI {
    private final UsuarioService usuarioService;

    @Override
    public UsuarioCriadoResponse postNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo) {
        log.info("[inicia] UsuarioController - postNovoUsuario");
        UsuarioCriadoResponse usuarioCriado = usuarioService.criaNovoUsuario(usuarioNovo);
        log.info("[finaliza] UsuarioController - postNovoUsuario");
        return usuarioCriado;
    }
}
