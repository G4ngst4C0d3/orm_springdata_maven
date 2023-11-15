package br.edu.ifsul.cstsi.Clinica_Veterinaria.model_1_1;

import jakarta.persistence.*;

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nomeCliente;
    private String enderecoCliente;
    private  String telefoneCliente;
    private  Long cepCliente;
    private  String emailCliente;

    public Cliente() {
    }

    public Cliente(String nomeCliente, String enderecoCliente, String telefoneCliente, Long cepCliente, String emailCliente) {
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
        this.cepCliente = cepCliente;
        this.emailCliente = emailCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public Long getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(Long cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }
    public int registrarCliente(){

        return 0;
    }
    public String  consultarCliente(){
        return this.nomeCliente;
    }
}
