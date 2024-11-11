package com.faculdade.faculdade.services;
import java.util.List;
import java.util.Optional;

import com.faculdade.faculdade.entities.Aluno;
import com.faculdade.faculdade.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FaculdadeService {
    @Autowired
    AlunoRepository alunoRepository;

    public Aluno findById(Integer ra) {
        Optional<Aluno> aluno = alunoRepository.findById((ra));
        return aluno.orElse(null);
    }

    public List<Aluno> listarTodosAbertos() {
        List<Aluno> alunos =
                alunoRepository.listarTodosAbertos();
        return alunos;
    }

    public List<Aluno> listarFechados() {
        List<Aluno> alunos =
                alunoRepository.listarFechados();
        return alunos;
    }

    public List<Aluno> findAll() {
        List<Aluno> alunos = alunoRepository.findAll();
        return alunos;
    }

    public Aluno findByNome(String nome) {
        Optional<Aluno> aluno = alunoRepository.findByNome(nome);
        return aluno.orElse(null);
    }

    public Aluno gravarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public void deletar(Integer ra) {
        alunoRepository.deleteById(ra);
    }

    public Aluno update(Integer ra, Aluno aluno) {
        Aluno alterado = findById(ra);
        if(alterado!=null){
            alterado.setNome(aluno.getNome());
            alterado.setDataCadastro(aluno.getDataCadastro());
            alterado.setAtivo(aluno.isAtivo());
            return alunoRepository.save(alterado);
        }
        return null;
    }

    public List<Aluno> findByParteNome(String nome) {
        List<Aluno> alunos = alunoRepository.findByParteNome(nome);
        return alunos;
    }


    private String limparFormatacao(String dados) {
//		System.out.println(dados);
        String dadosLimpo="";
        for(int i=0; i<dados.length() ; i++)
        {
            if(dados.charAt(i)=='.' || dados.charAt(i)=='-' || dados.charAt(i)=='/')
                continue;
            else
                dadosLimpo += dados.charAt(i);
        }
//		System.out.println(dadosLimpo);
        return dadosLimpo;
    }
}
