package model;

import model.Animal;
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
    private String nome_especie;

    @OneToMany
    private List <Animal> animais;
}
