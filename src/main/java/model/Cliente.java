package model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Cliente")
@Table(name = "Clientes")
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_cliente;

    private  String telefone_cliente;


    private  Long cep_cliente;

    private  String email_cliente;

    @Embedded
    private EnderecoCliente endereco_cliente;

    @OneToMany
    private List <Animal> animais;
}
