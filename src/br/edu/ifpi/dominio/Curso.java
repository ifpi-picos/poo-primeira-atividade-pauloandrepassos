
package br.edu.ifpi.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int ch;
    private String modalidade;
    private String nivel;
    //private LocalDate dataInicio;
    //private LocalDate dataFim;
    private boolean gratuito;
    private List<Aluno> alunos;
    private Professor professor;

    public Curso(String nome, int ch, String modalidade, String nivel, boolean gratuito, Professor professor) {
        setNome(nome);
        setCh(ch);
        setModalidade(modalidade);
        setNivel(nivel);
        setGratuito(gratuito);
        setProfessor(professor);
        this.alunos = new ArrayList<>();
    }

    public int getAlunosMatriculados() {
        return this.alunos.size();
    }
    
    public void realizarMatricula(Aluno aluno) {
        this.alunos.add(aluno);
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public void setGratuito(boolean gratuito) {
        this.gratuito = gratuito;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getNomeProfessor() {
        return this.professor.getNome();
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void status() {
        System.out.println("Nome:          " + this.nome);
        System.out.println("Carga horária: " + this.ch);
        System.out.println("Modalidade:    " + this.modalidade);
        System.out.println("Nível:         " + this.nivel);
        System.out.println("É gratuito:    " + this.gratuito);
        System.out.println("Professor:     " + this.professor + "\n");
    }
    
}