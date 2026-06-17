package dev.wakandaacademy.produdoro.usuario.application.service;

import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioCriadoResponse;
import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import jakarta.validation.Valid;

public interface UsuarioApplicationService {
    UsuarioCriadoResponse criaNovoUsuario(@Valid UsuarioNovoRequest usuarioNovo);
}
