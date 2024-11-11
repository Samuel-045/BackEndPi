package com.faculdade.faculdade.entities;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RA")
    int ra;
    @Column(name = "Nome")
    String nome;
    @Column(name = "Data Cadastro")
    Date dataCadastro;
    @Column(name= "ativo")
    private boolean ativo;
    @Column(name = "Cep")
    String cep;
    @Column(name = "Número")
    String numero;
    @Column(name = "Complemento")
    String complemento;
    public Aluno(String nome, Date dataCadastro, boolean ativo) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.ativo = ativo;
    }

//    public Cep getCep() {
//        return cep;
//    }
//
//    public void setCep(Cep cep) {
//        this.cep = cep;
//    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Aluno() {

    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", dataCadastro=" + dataCadastro +
                ", ativo=" + ativo +
//                ", cep=" + cep +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}