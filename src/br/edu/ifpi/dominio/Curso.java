package br.edu.ifpi.dominio;

import java.sql.Date;
import java.util.List;

public class Curso {
    private String nome;
    private int ch; //carga horária
    private String modalidade;
    private String nivel;
    private Date dataInicio;
    private Date dataFim;
    private boolean gratuito;
    private Professor professor;
    private List<Aluno> alunos;

    public Curso(String nome, int ch, String modalidade, String nivel, boolean gratuito, Professor professor) {
        this.nome = nome;
        this.ch = ch;
        this.modalidade =  modalidade;
        this.nivel = nivel;
        this.gratuito = gratuito;
        this.professor = professor;
    }

    public void realizarMatricula(Aluno aluno) {
        //this.alunos.add(alunos);
    }

    public String getNome() {
        return nome;
    }

    public int getCh() {
        return ch;
    }

    public String getModalidade() {
        return modalidade;
    }

    public String getNivel() {
        return nivel;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    
}
