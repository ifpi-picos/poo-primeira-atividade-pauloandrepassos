
package br.edu.ifpi.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int ch;
    private String modalidade;
    private String nivel;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private boolean gratuito;
    private List<Aluno> alunos;
    private Professor professor;

    public Curso(String nome, int ch, String modalidade, String nivel, boolean gratuito, Professor professor) {
        this.nome = nome;
        this.ch = ch;
        this.modalidade = modalidade;
        this.nivel = nivel;
        this.gratuito = gratuito;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void realizarMatricula(Aluno aluno) {
        this.alunos.add(aluno);
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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public boolean isGratuito() {
        return gratuito;
    }

    public String getNomeProfessor() {
        return this.professor.getNome();
      }
      
    public Professor getProfessor() {
        return professor;
    }


    
}