package com.talentos.aluguel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.talentos.aluguel.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	
	Optional<Livro> findByTitulo(String titulo);

}
