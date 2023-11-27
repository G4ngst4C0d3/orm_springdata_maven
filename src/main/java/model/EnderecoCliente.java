package model;

import jakarta.persistence.*;




@Embeddable
public class EnderecoCliente {
        private Long id;

        private String rua_cliente;


        private String bairro_cliente;


        private String uf_cliente;

}
