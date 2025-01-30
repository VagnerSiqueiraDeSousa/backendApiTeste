package br.com.seteu.criandoapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import static com.sun.org.apache.xml.internal.serializer.Method.TEXT;
@Getter
@Setter

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome_completo", length = 200, nullable = true)
    private String nome;

    @Column(name = "email", length = 50, nullable = true)
    private String email;

    @Column(name = "senha", columnDefinition = TEXT, nullable = true)
    private String senha;

    @Column(name = "telefone", length = 15, nullable = true)
    private String Telefone;


}
