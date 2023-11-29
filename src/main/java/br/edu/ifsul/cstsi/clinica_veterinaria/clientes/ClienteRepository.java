package br.edu.ifsul.cstsi.clinica_veterinaria.clientes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
    @Query(value = "SELECT c FROM Cliente c where c.nome_cliente like ?1")
    List<Cliente> findByNome(String nome_cliente);
}
