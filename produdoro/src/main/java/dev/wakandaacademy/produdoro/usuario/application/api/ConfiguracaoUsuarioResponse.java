package dev.wakandaacademy.produdoro.usuario.application.api;

import lombok.Value;

@Value
public class ConfiguracaoUsuarioResponse {

    private final Integer tempoMinutosFoco;
    private final Integer tempoMinutosPausaCurta;
    private final Integer tempoMinutosPausaLonga;
    private final Integer repeticoesParaPausaLonga;
}
