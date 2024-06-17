package Pizzaria_VovoBETH.Model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Email")
    private String email;
    @Column(name = "Senha")
    private String senha;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public void setId(Long id) {
        this.id = id;
    }

    @ElementCollection
    private List<Long> historicoPedidos;
}
