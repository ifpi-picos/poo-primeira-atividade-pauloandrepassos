package br.edu.ifpi.dominio;

public class Certificado {
    private Curso curso;
    private Aluno aluno;

    public Certificado(Curso curso, Aluno aluno) {
        setCurso(curso);
        setAluno(aluno);
    }

    public Curso getCurso() {
        return curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}