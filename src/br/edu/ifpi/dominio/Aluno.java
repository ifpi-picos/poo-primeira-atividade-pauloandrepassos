package br.edu.ifpi.dominio;

public class Aluno {
    private String nome;
    private String email;
    private String matricula;

    public Aluno(String nome, String email, String matricula) {
        setNome(nome);
        setEmail(email);
        setMatricula(matricula);
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void status() {
        System.out.println("Nome:      " + this.getNome());
        System.out.println("Email:     " + this.getEmail());
        System.out.println("Matrícula: " + this.getMatricula() + "\n");
    }
    
    
}