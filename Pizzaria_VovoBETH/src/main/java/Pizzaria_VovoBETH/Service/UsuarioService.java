package Pizzaria_VovoBETH.Service;

import Pizzaria_VovoBETH.Model.Usuario;
import Pizzaria_VovoBETH.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<Usuario> autenticar(String email, String senha) {
        return usuarioRepository.findByEmailAndSenha(email, senha);
    }
}
