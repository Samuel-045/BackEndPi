package com.farmacia.Farmacia.repositories;

import com.farmacia.Farmacia.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository
    extends JpaRepository <Pessoa, Integer> {
}
