package br.edu.ifsul.cstsi.Clinica_Veterinaria.model_1_1.control.model;
import jakarta.persistence.*;
import lombok.*;

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
    @JoinColumn(name = "animais", referencedColumnName = "id")
    private Animal animal;

    @OneToMany(mappedBy = "tratamento")
    private List <Consulta> consultas;

}
