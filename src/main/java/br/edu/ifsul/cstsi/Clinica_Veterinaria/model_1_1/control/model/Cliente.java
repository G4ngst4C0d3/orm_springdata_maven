package br.edu.ifsul.cstsi.Clinica_Veterinaria.model_1_1.control.model;

import jakarta.persistence.*;
@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nome_cliente", nullable = false, length = 50)
    private String nome_cliente;
    @Column(name = "endereco_cliente", nullable = false, length = 255)

    private String endereco_cliente;
    @Column(name = "telefone_cliente", nullable = false, length = 50)

    private  String telefone_cliente;
    @Column(name = "cep_cliente", nullable = false, length = 50)

    private  Long cep_cliente;
    @Column(name = "email_cliente", nullable = false, length = 50, unique = true)

    private  String email_cliente;

}
