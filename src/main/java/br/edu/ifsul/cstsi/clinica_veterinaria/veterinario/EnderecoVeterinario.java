package br.edu.ifsul.cstsi.clinica_veterinaria.veterinario;


import jakarta.persistence.Embeddable;

@Embeddable
public class EnderecoVeterinario {
    private Long id;

    private String rua_vet;

    private String bairro_vet;

    private String cidade_cliente;

    private String uf_cliente;
}
