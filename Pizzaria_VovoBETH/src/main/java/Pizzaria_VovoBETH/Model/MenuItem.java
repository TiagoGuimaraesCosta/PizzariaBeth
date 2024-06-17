package Pizzaria_VovoBETH.Model;

import jakarta.persistence.*;

@Entity
@Table
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome_Cardapio")
    private String nome;
    @Column(name = "Ingredientes")
    private String ingredientes;
    @Column(name = "Preco")
    private double preco;
    @Column(name = "Imagem")
    private String imagem;

}
