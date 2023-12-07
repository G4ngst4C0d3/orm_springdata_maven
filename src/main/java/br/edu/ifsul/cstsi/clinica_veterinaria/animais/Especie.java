package br.edu.ifsul.cstsi.clinica_veterinaria.animais;

import br.edu.ifsul.cstsi.clinica_veterinaria.animais.Animal;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Especie")
@Table(name = "especies")
public class Especie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "nome_especie", nullable = false, length = 50)
    private String nome_especie;

    @OneToMany(mappedBy = "especie")
    private List <Animal> animais;
}
