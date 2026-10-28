package com.sistema.aluguel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.aluguel.entity.Morador;

public interface MoradorRepository extends JpaRepository<Morador, Long> {

}
