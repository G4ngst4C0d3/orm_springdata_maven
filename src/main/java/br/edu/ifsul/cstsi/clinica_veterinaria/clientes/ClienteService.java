package br.edu.ifsul.cstsi.clinica_veterinaria.clientes;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository rep;

    public List<Cliente> getClientes(){
        return rep.findAll();
    }

    public Cliente insert(Cliente cliente) {
        Assert.isNull(cliente.getId(), "Não foi possível cadastrar o cliente.");
        return rep.save(cliente);
    }

    public void delete(Long id){
        rep.deleteById(id);
    }
}
