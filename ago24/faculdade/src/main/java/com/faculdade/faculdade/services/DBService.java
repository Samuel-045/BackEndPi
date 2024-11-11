package com.faculdade.faculdade.services;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import com.faculdade.faculdade.entities.Aluno;
import com.faculdade.faculdade.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
@Service
public class DBService {
    @Autowired
    private AlunoRepository alunoRepository;

    @Bean
    public void instanciarDB() throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Aluno aluno1 = new Aluno("Marcos de Arruda Monteiro", formato.parse("01/01/2001"), true);
        Aluno aluno2 = new Aluno("Rodrigo Silva", formato.parse("02/02/2002"), false);
        Aluno aluno3 = new Aluno("Marcos Pontes", formato.parse("03/03/2003"), false);
        Aluno aluno4 = new Aluno("Juca Monteiro", formato.parse("04/04/2004"), true);

        alunoRepository.saveAll(Arrays.asList(aluno1, aluno2, aluno3, aluno4));
//        System.out.println(alunoRepository.findAll());
    }
}
