package com.farmacia.Farmacia.services;

import com.farmacia.Farmacia.model.Pessoa;
import com.farmacia.Farmacia.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class DBService {
    @Autowired
    private PessoaRepository pessoaRepository;
    @Bean
    public void instanciarDB() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Pessoa pessoa1 = new Pessoa("Marcos Monteiro", "marcos@gmail.com",
                "07898757825",
                LocalDateTime.parse("01/08/2022 09:30", formato));
        Pessoa pessoa2 = new Pessoa("Marcelo Monteiro", "marcelo@gmail.com",
                "05789757825",
                LocalDateTime.parse("01/08/2024 08:30", formato));
        pessoaRepository.saveAll(Arrays.asList(pessoa1, pessoa2));
    }
}
