package com.codigo.tatuadoraBackEnd.controller;

import com.codigo.tatuadoraBackEnd.entidades.Pessoa;
import com.codigo.tatuadoraBackEnd.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class loginController {
    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/l")
    public Boolean validarLogin(@RequestBody Pessoa pessoaInput){

        boolean cpfValido = pessoaService.validacaoCpf(pessoaInput.getCpf());
        if(cpfValido){
            boolean valido = pessoaService.validarLogin(pessoaInput.getSenha(), pessoaInput.getCpf());
            if(valido){
                return true;
            }
            return false;
        }else {
            return false;
        }

    }

}
