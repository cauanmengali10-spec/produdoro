package dev.wakandaacademy.produdoro.usuario.infra;

import dev.wakandaacademy.produdoro.usuario.application.service.UsuarioRepository;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepositoryMongoDB implements UsuarioRepository {
    private UsuarioSpringSpringRepository usuarioMongoRepository;

    @Override
    public Usuario salva(Usuario usuario) {
        return usuarioMongoRepository.save(usuario);



    }
}
