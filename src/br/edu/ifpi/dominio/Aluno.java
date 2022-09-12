package br.edu.ifpi.dominio;

public class Aluno {
    private String nome;
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

    public String getEmail() {
        return email;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno [email=" + email + ", matricula=" + matricula + ", nome=" + nome + "]";
    }

    
    
}