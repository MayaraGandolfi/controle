package br.com.ada.controle.service;

import br.com.ada.controle.model.Usuario;
import br.com.ada.controle.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;


    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario salvar(Usuario usuario) {
        Usuario usuarioEncontrado = buscarPorCpf(usuario.getCpf());
        if (usuarioEncontrado != null){
            throw new IllegalArgumentException("CPF ja está cadastrado em outro usuario");
        }
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario buscarPorCpf(String cpf){
        return usuarioRepository.findByCpf(cpf);
    }

    public List<Usuario> listarTodos() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public String deletar(Long id) {
        Usuario usuarioEncontrado = buscarPorId(id);
        if (usuarioEncontrado == null) {
            throw new IllegalArgumentException("Usuario não encontrado");
        }
        usuarioRepository.delete(usuarioEncontrado);
        return "Usuario deletado";
    }

}
