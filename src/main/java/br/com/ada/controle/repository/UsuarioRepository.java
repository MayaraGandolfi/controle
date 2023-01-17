package br.com.ada.controle.repository;

import br.com.ada.controle.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
    Usuario findById(Usuario usuario);
    Usuario findByCpf(String cpf);


}
