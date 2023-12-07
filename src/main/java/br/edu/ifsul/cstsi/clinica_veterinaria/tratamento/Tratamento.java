package br.edu.ifsul.cstsi.clinica_veterinaria.tratamento;
import br.edu.ifsul.cstsi.clinica_veterinaria.consulta.Consulta;
import jakarta.persistence.*;
import lombok.*;
import br.edu.ifsul.cstsi.clinica_veterinaria.animais.Animal;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Tratamento")
@Table(name = "tratamentos")
public class Tratamento {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data_inicio;
    private LocalDate data_final;

    @ManyToOne
    @JoinColumn(name = "animais_id", referencedColumnName = "id")
    private Animal animal;

    @OneToMany(mappedBy = "tratamento")
    private List <Consulta> consultas;

}
