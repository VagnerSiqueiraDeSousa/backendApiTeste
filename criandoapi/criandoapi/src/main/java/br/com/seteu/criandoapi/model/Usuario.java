package br.com.seteu.criandoapi.model;

import jakarta.persistence.*;

import static com.sun.org.apache.xml.internal.serializer.Method.TEXT;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome_completo", length = 200, nullable = true)
    private String nome;

    @Column(name = "username", length = 200, nullable = true)
    private String usernome;

    @Column(name = "email", length = 50, nullable = true)
    private String email;

    @Column(name = "senha", columnDefinition = TEXT, nullable = true)
    private String senha;

    @Column(name = "telefone", length = 15, nullable = true)
    private String Telefone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsernome() {
        return usernome;
    }

    public void setUsernome(String usernome) {
        this.usernome = usernome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
}
