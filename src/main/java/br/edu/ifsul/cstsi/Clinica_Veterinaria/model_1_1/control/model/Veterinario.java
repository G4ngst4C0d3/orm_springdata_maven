package br.edu.ifsul.cstsi.Clinica_Veterinaria.model_1_1.control.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Veterinario")
@Table(name = "veterinarios")
public class Veterinario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_vet;
    private String endereco_vet;
    private String tel_vet;


    @OneToMany
    private List<Consulta> consultas;
}
