package dev.wakandaacademy.produdoro.usuario.infra;

import dev.wakandaacademy.produdoro.usuario.application.service.UsuarioRepository;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UsuarioRepositoryMongoDB implements UsuarioRepository {
    private final UsuarioSpringMongoRepository usuarioMongoRepository;

    @Override
    public Usuario salva(Usuario usuario) {
        return usuarioMongoRepository.save(usuario);



    }
}
