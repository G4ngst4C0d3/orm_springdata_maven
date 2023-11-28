package br.edu.ifsul.cstsi.clinica_veterinaria.clientes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
