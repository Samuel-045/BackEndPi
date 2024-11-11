package com.farmacia.Farmacia;

import com.farmacia.Farmacia.model.Pessoa;
import com.farmacia.Farmacia.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@SpringBootApplication
public class FarmaciaDoPovaoApplication {
	@Autowired
	private PessoaRepository pessoaRepository;
	public static void main(String[] args) {
		SpringApplication.run(FarmaciaDoPovaoApplication.class, args);
	}

}
