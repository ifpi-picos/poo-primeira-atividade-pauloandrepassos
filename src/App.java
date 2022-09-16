import br.edu.ifpi.dominio.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno a1 = new Aluno("Paulo", "paulo@email", "curso123");
        Aluno a2 = new Aluno("João", "joao@email", "curso795");

        System.out.println("Dados aluno 1: ");
        a1.status();
        System.out.println("Dados aluno 2: ");
        a2.status();
    }
}
