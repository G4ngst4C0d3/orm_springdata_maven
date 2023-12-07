package br.edu.ifsul.cstsi.clinica_veterinaria.exame;

import br.edu.ifsul.cstsi.clinica_veterinaria.consulta.Consulta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Exame")
@Table(name = "exames")
public class Exame {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String desc_exame;

    @ManyToOne
    @JoinColumn(name = "consultas", referencedColumnName = "id")
    private Consulta consulta;
}
