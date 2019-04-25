package com.talentos.aluguel.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.talentos.aluguel.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
	
	Optional<Reserva> findByClienteAndLivro(Long idCliente, Long idLivro);

}
