package br.edu.ifsul.cstsi.Clinica_Veterinaria.model_1_1.control.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Animal")
@Table(name="animais")
public class Animal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_animal;
    private int idade_animal;
    private String sexo_animal;

    @OneToMany(mappedBy = "animal")
    private List<Tratamento> tratamentos;


}
