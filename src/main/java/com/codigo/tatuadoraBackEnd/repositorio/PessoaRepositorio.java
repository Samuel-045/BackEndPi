package com.codigo.tatuadoraBackEnd.repositorio;

import com.codigo.tatuadoraBackEnd.entidades.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PessoaRepositorio extends JpaRepository<Pessoa,String> {

    @Query("SELECT p FROM Pessoa p")
    List<Pessoa> listarUsuarios();

    @Query("SELECT p FROM Pessoa p WHERE p.senha = :senha AND p.cpf = :cpf")
    Optional<Pessoa> validacaoLogin(String senha, String cpf);

}

