package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.application.service.UsuarioApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Log4j2
public class UsuarioController implements UsuarioAPI {
    private final UsuarioApplicationService usuarioApplicationService;



    @Override
    public UsuarioCriadoResponse postNovoUsuario(UsuarioNovoRequest usuarioNovo) {
        log.info("[start] UsuarioController - postNovoUsuario");
        UsuarioCriadoResponse usuarioCriado = usuarioApplicationService.criaNovoUsuario(usuarioNovo);
        log.info("[finish] UsuarioController - postNovoUsuario");
        return usuarioCriado;
    }
}
