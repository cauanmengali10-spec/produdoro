package dev.wakandaacademy.produdoro.usuario.application.api;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/usuario")
public interface UsuarioAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    UsuarioCriadoResponse postNovoUsuario(@RequestBody @Valid UsuarioNovoRequest novoUsuario);

}
