package br.edu.ifsul.cstsi.clinica_veterinaria.animais;

import jakarta.persistence.*;
import lombok.*;
import br.edu.ifsul.cstsi.clinica_veterinaria.tratamento.Tratamento;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Animal")
@Table(name="animais")
public class Animal {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_animal", nullable = false, length = 50)
    private String nome_animal;

    @Column(name = "idade_animal", nullable = false)
    private int idade_animal;

    @Column(name = "sexo_animal", nullable = false)
    private String sexo_animal;

    @OneToMany(mappedBy = "animal")
    private List<Tratamento> tratamentos;

    @ManyToOne
    @JoinColumn(name = "especies",referencedColumnName = "id")
    private Especie especie;
}
