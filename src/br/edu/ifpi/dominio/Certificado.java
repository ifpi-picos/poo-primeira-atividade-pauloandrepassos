package br.edu.ifpi.dominio;

import java.time.LocalDate;

public class Certificado {
    private LocalDate dataEmissao;
    private Curso curso;
    private Aluno aluno;

    public Certificado(LocalDate dataEmissao, Curso curso, Aluno aluno) {
        this.dataEmissao = dataEmissao;
        this.curso = curso;
        this.aluno = aluno;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public Curso getCurso() {
        return curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    
}