package br.edu.ifsul.cstsi.Clinica_Veterinaria.model_1_1.control.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tratamento {
    private LocalDate data_inicio;
    private LocalDate data_final;

}
