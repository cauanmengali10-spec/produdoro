package dev.wakandaacademy.produdoro.usuario.application.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Value;

@Value
public class UsuarioNovoRequest {

    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Email inválido")
    private final String email;
    @Size(min = 6, message = "A senha deve conter no mínimo 6 caracteres")
    private final String senha;
}
