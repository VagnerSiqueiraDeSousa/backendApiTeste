package br.com.seteu.criandoapi.DAO;

import br.com.seteu.criandoapi.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {
}
