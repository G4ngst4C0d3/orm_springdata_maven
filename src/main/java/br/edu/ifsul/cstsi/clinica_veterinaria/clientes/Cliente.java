package br.edu.ifsul.cstsi.clinica_veterinaria.clientes;

import jakarta.persistence.*;
import lombok.*;
import br.edu.ifsul.cstsi.clinica_veterinaria.animais.Animal;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Cliente")
@Table(name = "clientes")
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome_cliente;


    private  Integer telefone_cliente;


    private  Long cep_cliente;


    private  String email_cliente;

    @Embedded
    private EnderecoCliente endereco_cliente;

    @OneToMany(mappedBy = "cliente")
    private List<Animal> animais;

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
