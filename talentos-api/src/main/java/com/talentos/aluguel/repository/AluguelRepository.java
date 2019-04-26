package com.talentos.aluguel.repository;

import java.util.Date;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.talentos.aluguel.model.Aluguel;

public interface AluguelRepository extends JpaRepository<Aluguel, Long>  {
	
	Optional<Aluguel> findByClienteAndLivro(Long idCliente, Long idLivro);
	Optional<Aluguel> findByStartDateBetween (Date startDate, Date todayDate);

}
