import br.edu.ifpi.dominio.Aluno;
import br.edu.ifpi.dominio.Curso;
import br.edu.ifpi.dominio.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Professor p1 = new Professor("Fulano", "fulano@email", "ADS");
        Curso c1 = new Curso("ADS", 2000, "Presencial", "Superior", true, p1);
        Aluno a1 = new Aluno("Paulo", "paulo@email", "curso123");
        Aluno a2 = new Aluno("João", "joao@email", "curso795");

        System.out.println("Dados aluno 1: ");
        a1.status();
        System.out.println("Dados aluno 2: ");
        a2.status();
    }
}
