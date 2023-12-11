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
        return  rep.findAllById();
    }

    public Cliente getClienteById(Long id) {
        Optional<Cliente> optional = rep.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }
    public List<Cliente> getClientesByNome(String nome_cliente) {
        return new ArrayList<>(rep.findByNome(nome_cliente + "%"));
    }
    public Cliente insert(Cliente cliente) {
        Assert.isNull(cliente.getId(),"Não foi possível inserir o registro");
        return rep.save(cliente);
    }
    public Cliente update(Cliente cliente) {
        Assert.notNull(cliente.getId(),"Não foi possível atualizar o registro");

        Optional<Cliente> optional = rep.findById(cliente.getId());
        if(optional.isPresent()) {
            Cliente db = optional.get();
            db.setNome_cliente(cliente.getNome_cliente());
            rep.save(db);

            return db;
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro");
        }
    }
    public void delete(Long id) {

        rep.deleteById(id);
    }
}
