
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        String nome, curso;
        int matricula, anoIngresso;

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do aluno");
            nome = scanner.next();
            System.out.println("Digite a matricula do aluno");
            matricula = scanner.nextInt();
            System.out.println("Digite o curso do aluno");
            curso = scanner.next();
            System.out.println("Digite ano do aluno");
            anoIngresso = scanner.nextInt();
            Aluno aluno1 = new Aluno(nome, matricula, curso, anoIngresso);
            aluno1.addDisciplina("Programação");
            aluno1.addDisciplina("Modelagem");
            listaAlunos.add(aluno1);

        }
        System.out.println("Hello, World!");
    }
}
