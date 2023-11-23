package br.edu.ifsul.cstsi.Clinica_Veterinaria.model_1_1.control.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Consulta")
@Table(name = "consultas")
public class Consulta {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data_consulta;
    private String historico;

    @ManyToOne
    @JoinColumn(name = "tratamentos", referencedColumnName = "id")
    private Tratamento tratamento;

    @ManyToOne
    @JoinColumn(name = "veterinarios",referencedColumnName = "id")
    private Veterinario veterinario;

    @OneToMany
    private List<Exame> exames;
}
