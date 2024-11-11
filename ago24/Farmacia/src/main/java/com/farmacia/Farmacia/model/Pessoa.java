package com.farmacia.Farmacia.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
@Entity
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RG")
    int rg;

    @Column (name = "Data de Cadastro")
    LocalDateTime dataCadastro;

    @Column(name = "Nome")
    String nome;

    @Column(name = "e-mail")
    String email;

    @Column(name = "cpf")
    String cpf;

    public Pessoa() {
    }

    public Pessoa(int rg, String nome, String email, String cpf, LocalDateTime dataCadastro) {
        this.rg = rg;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
    }

    public Pessoa(String nome, String email, String cpf, LocalDateTime dataCadastro) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
    }

    public int getRg() {

        return rg;
    }

    public void setRa(int rg) {
        this.rg = rg;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "rg=" + rg +
                ", dataCadastro=" + dataCadastro +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}