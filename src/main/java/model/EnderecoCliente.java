package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Consulta;

import java.util.List;



@Embeddable
public class EnderecoCliente {
        private Long id;
        private String rua;
        private String bairro;
        private String cidade;


}
