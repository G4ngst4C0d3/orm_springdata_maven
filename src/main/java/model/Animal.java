package model;

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

    @ManyToOne
    @JoinColumn(name = "especies",referencedColumnName = "id")
    private Especie especie;
}
