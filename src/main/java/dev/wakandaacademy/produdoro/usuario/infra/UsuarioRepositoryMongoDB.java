package dev.wakandaacademy.produdoro.usuario.infra;

import dev.wakandaacademy.produdoro.usuario.application.service.UsuarioRepository;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class UsuarioRepositoryMongoDB implements UsuarioRepository {
    private final UsuarioSpringMongoRepository usuarioMongoRepository;

    @Override
    public Usuario salva(Usuario usuario) {
        log.info("[inicia] UsuarioRepositoryMongoDB - salva");
        Usuario novoUsuario = usuarioMongoRepository.save(usuario);
        log.info("[inicia] UsuarioRepositoryMongoDB - salva");
        return novoUsuario;
    }
}
