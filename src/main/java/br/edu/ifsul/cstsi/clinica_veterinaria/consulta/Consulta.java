package br.edu.ifsul.cstsi.clinica_veterinaria.consulta;

import br.edu.ifsul.cstsi.clinica_veterinaria.veterinario.Veterinario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import br.edu.ifsul.cstsi.clinica_veterinaria.exame.Exame;
import br.edu.ifsul.cstsi.clinica_veterinaria.tratamento.Tratamento;

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
