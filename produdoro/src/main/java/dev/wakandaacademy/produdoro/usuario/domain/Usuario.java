package dev.wakandaacademy.produdoro.usuario.domain;


import dev.wakandaacademy.produdoro.usuario.application.api.UsuarioNovoRequest;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import java.util.UUID;


@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(collection = "Usuario")
@Getter
public class Usuario {

    @Id
    private UUID idUsuario;
    @Email
    @Indexed
    private String email;
    private ConfiguracaoUsuario configuracao;
    @Builder.Default
    private StatusUsuario status = StatusUsuario.FOCO;
    @Builder.Default
    private Integer quantidadePomodorosPausaCurta = 0;


    public Usuario(UsuarioNovoRequest usuarioNovo){
        this.email = usuarioNovo.getEmail();
        this.status = StatusUsuario.FOCO;
        this.configuracao = ConfiguracaoUsuario.builder()
                .tempoMinutosFoco(25)
                .tempoMinutosPausaCurta(5)
                .tempoMinutosPausaLonga(15)
                .repeticoesParaPausaLonga(3)
                .build();
    }






}
