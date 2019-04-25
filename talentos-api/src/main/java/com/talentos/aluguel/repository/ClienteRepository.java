package com.talentos.aluguel.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.talentos.aluguel.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	Optional<Cliente> findByNome(String nome);
}