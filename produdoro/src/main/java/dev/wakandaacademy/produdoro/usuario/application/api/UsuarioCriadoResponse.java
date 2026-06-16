package dev.wakandaacademy.produdoro.usuario.application.api;

import dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoUsuario;
import dev.wakandaacademy.produdoro.usuario.domain.StatusUsuario;
import lombok.Builder;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.validation.constraints.Email;
import java.util.UUID;

public class UsuarioCriadoResponse {

    private UUID Idusuario;
    private String email;
    private ConfiguracaoUsuario configuracaoUsuario;
    private StatusUsuario status;
    private Integer quantidadePomodorosPausaCurta = 0;

}
