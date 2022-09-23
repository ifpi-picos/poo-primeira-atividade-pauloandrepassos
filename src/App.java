import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.ifpi.dominio.Aluno;
import br.edu.ifpi.dominio.Curso;
import br.edu.ifpi.dominio.Professor;

public class App {
    static List<Curso> cursos = new ArrayList<>();
    static List<Aluno> alunos = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Professor p1 = new Professor("Paulo", "paulo@email", "sistemas de informação");
        List<Integer> opcoes = new ArrayList<>();
        opcoes.add(1);
        opcoes.add(2);
        opcoes.add(3);
        opcoes.add(4);
        opcoes.add(5);
        opcoes.add(6);

        int opcaoSelecionada = 1;
        while (opcoes.get(opcaoSelecionada) != 6) {
            opcaoSelecionada = exibirMenu(opcoes);
            if (opcoes.get(opcaoSelecionada) == 1) {
                cadastrarCurso(p1);
            } else if (opcoes.get(opcaoSelecionada) == 2) {
                matricularAluno();
            } else if (opcoes.get(opcaoSelecionada) == 3) {
                exibirCursos();
            } else if (opcoes.get(opcaoSelecionada) == 4) {
                exibirAlunos();
            } else if (opcoes.get(opcaoSelecionada) == 5) {
                gerarCertificado();
            }
        }
    }

    private static int exibirMenu(List<Integer> opcoes) {
        Object[] optionsArray = opcoes.toArray();
        int opcaoSelecionad = JOptionPane.showOptionDialog(null,
                "1. Cadastrar curso \n2. Cadastrar aluno \n3. Exibir cursos \n 4.Exibir alunos \n5. Gerar certificado \n6. Encerrar",
                "Selecione",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                optionsArray, null);
        return opcaoSelecionad;
    }

    private static void cadastrarCurso(Professor p1) {
        String nomeCurso = JOptionPane.showInputDialog("Nome do Curso");
        String chCurso = JOptionPane.showInputDialog("Carga horária do curso");
        String modalidadeCurso = JOptionPane.showInputDialog("Modalidade do curso");
        String nivelCurso = JOptionPane.showInputDialog("Nível do Curso");

        Curso novoCurso = new Curso(nomeCurso, Integer.parseInt(chCurso), modalidadeCurso, nivelCurso, p1);
        cursos.add(novoCurso);
    }

    private static void matricularAluno() {
        List<String> opcoes = new ArrayList<>();
        for (Curso curso : cursos) {
            opcoes.add(curso.getNome());
        }
        Object[] optionsArray = opcoes.toArray();
        int opcaoSelecionada = JOptionPane.showOptionDialog(null,
                "Selecion o curso",
                "Cursos",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                optionsArray, null);

        String nomeCursoSelecionado = opcoes.get(opcaoSelecionada);
        String nomeAluno = JOptionPane.showInputDialog("Nome do aluno");
        String emailAluno = JOptionPane.showInputDialog("Email do aluno");
        String matriculaAluno = JOptionPane.showInputDialog("Matricula do aluno");

        Aluno novoAluno = new Aluno(nomeAluno, emailAluno, matriculaAluno);

        for (Curso curso : cursos) {
            if (curso.getNome().equals(nomeCursoSelecionado)) {
                curso.realizarMatricula(novoAluno);
                break;
            }
        }
        
        alunos.add(novoAluno);
    }

    private static void exibirCursos() {
        String info = "";
        for (Curso curso : cursos) {
            info = info + curso.getNome() + "\n    CH: " + curso.getCh() + " Nível: " + curso.getNivel() + " Modalidade: " + curso.getModalidade() + "\n";
            for (Aluno aluno : curso.getAlunos()) {
                info = info + " - " + aluno.getNome() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, info, "Cursos", JOptionPane.PLAIN_MESSAGE);
    }

    private static void exibirAlunos() {
        String info = "";
        for (Aluno aluno : alunos) {
            info = info + aluno.getNome() + "\n    Email: " + aluno.getEmail() + "  Matrícula: " + aluno.getMatricula() + "\n";
        }
        JOptionPane.showMessageDialog(null, info, "Alunos", JOptionPane.PLAIN_MESSAGE);
    }

    private static void gerarCertificado() {
        List<Integer> opcoesAl = new ArrayList<>();
        for (int i = 1; i <= alunos.size(); i++) {
            opcoesAl.add(i);
        }
    } //incompleto
}
