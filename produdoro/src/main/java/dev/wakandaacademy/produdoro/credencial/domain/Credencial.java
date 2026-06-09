package dev.wakandaacademy.produdoro.credencial.domain;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



@Builder
@Document(collection = "Credencial")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Credencial {

    @Getter
    @MongoId(targetType = FieldType.STRING)
    private String usuario;
    private String senha;

    public Credencial(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = new BCryptPasswordEncoder().encode(senha);

    }

    public String getSenha(){
        return senha;
    }
}
