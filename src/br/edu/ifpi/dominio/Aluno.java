package br.edu.ifpi.dominio;

import java.sql.Date;

public class Aluno {
    private String nome;
    private Date dataNascimento;
    private String email;
    private String matricula;

    public Aluno(String nome, String email, String matricula) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public String getEmail() {
        return email;
    }
    public String getMatricula() {
        return matricula;
    }

    
}
