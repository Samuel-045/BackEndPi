package com.faculdade.faculdade.repositories;

import com.faculdade.faculdade.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AlunoRepository
        extends JpaRepository<Aluno, Integer>{
    @Query("SELECT alunos FROM Aluno alunos "
            + "WHERE alunos.ativo=true ORDER BY alunos.nome")
    List<Aluno> listarTodosAbertos();

    @Query("SELECT alunos FROM Aluno alunos "
            + "WHERE alunos.ativo=false ORDER BY alunos.dataCadastro")
    List<Aluno> listarFechados();

    Optional<Aluno> findByNome(String nome);

    /**
     * consulta parte do nome
     */
    @Query("SELECT alunos FROM Aluno alunos "
            + "WHERE alunos.nome LIKE %:nome%")
    List<Aluno> findByParteNome(String nome);
}
