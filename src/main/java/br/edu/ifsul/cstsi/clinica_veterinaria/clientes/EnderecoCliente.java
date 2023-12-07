package br.edu.ifsul.cstsi.clinica_veterinaria.clientes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class EnderecoCliente {

        private String rua_cliente;


        private String bairro_cliente;


        private String uf_cliente;


}
