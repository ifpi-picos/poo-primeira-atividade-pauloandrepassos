package br.edu.ifpi.dominio;

public class Professor {
    private String nome;
    private String email;
    private String formacao;

    public Professor(String nome, String email, String formacao) {
        this.nome = nome;
        this.email = email;
        this.formacao = formacao;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getFormacao() {
        return formacao;
    }

}
