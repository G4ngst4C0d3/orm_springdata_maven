package br.edu.ifsul.cstsi.clinica_veterinaria.clientes;

import jakarta.persistence.*;
import lombok.*;
import br.edu.ifsul.cstsi.clinica_veterinaria.animais.Animal;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Cliente")
@Table(name = "Clientes")
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_cliente", nullable = false, length = 50)
    private String nome_cliente;

    @Column(name = "telefone_cliente", nullable = false, length = 50)
    private  Integer telefone_cliente;

    @Column(name = "cep_cliente", nullable = false, length = 50)
    private  Long cep_cliente;

    @Column(name = "email_cliente", nullable = false, length = 50,unique = true)
    private  String email_cliente;

    @Embedded
    private EnderecoCliente endereco_cliente;

    @OneToMany
    private List <Animal> animais;

    @Override
    public String toString() {
        return "br.edu.ifsul.cstsi.clinica_veterinaria.clientes.Cliente{" +
                "id=" + id +
                ", nome_cliente='" + nome_cliente + '\'' +
                ", telefone_cliente='" + telefone_cliente + '\'' +
                ", cep_cliente=" + cep_cliente +
                ", email_cliente='" + email_cliente + '\'' +
                ", endereco_cliente=" + endereco_cliente +
                ", animais=" + animais +
                '}';
    }
}
