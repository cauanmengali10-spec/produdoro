package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoUsuario;
import dev.wakandaacademy.produdoro.usuario.domain.StatusUsuario;
import lombok.Builder;
import lombok.Value;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.validation.constraints.Email;
import java.util.UUID;

@Value
public class UsuarioCriadoResponse {

    private final UUID Idusuario;
    private final String email;
    private final ConfiguracaoUsuarioResponse configuracao;
    private final StatusUsuario status;
    private final Integer quantidadePomodorosPausaCurta = 0;

}
