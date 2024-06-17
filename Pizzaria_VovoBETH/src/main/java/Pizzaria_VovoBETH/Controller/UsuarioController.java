package Pizzaria_VovoBETH.Controller;

import Pizzaria_VovoBETH.Model.Usuario;
import Pizzaria_VovoBETH.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
@RestController
@RequestMapping("/api/admin")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestParam String email, @RequestParam String senha) {
        Optional<Usuario> usuario = usuarioService.autenticar(email, senha);
        return usuario.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(401).build());
    }
}
