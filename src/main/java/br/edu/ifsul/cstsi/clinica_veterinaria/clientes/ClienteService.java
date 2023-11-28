package br.edu.ifsul.cstsi.clinica_veterinaria.clientes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository rep;
}
