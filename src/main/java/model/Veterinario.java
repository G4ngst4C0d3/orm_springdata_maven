package model;

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

    @Column(name = "nome_vet", nullable = false, length = 50)
    private String nome_vet;

    @Column(name = "tel_vet", nullable = false, length = 50)
    private String tel_vet;

    @Embedded
    private EnderecoVeterinario enderecoveterinario;

    @OneToMany
    private List<Consulta> consultas;
}
