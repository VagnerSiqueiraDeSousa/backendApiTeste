package br.com.seteu.criandoapi.repository;

import br.com.seteu.criandoapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuario extends JpaRepository<Usuario, Integer> {
}
