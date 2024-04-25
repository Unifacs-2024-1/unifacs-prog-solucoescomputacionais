import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        String nome, curso;
        int matricula, anoIngresso, qtdeDisciplinas;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        nome = scanner.next();
        System.out.println("Digite a matrícula do aluno: ");
        matricula = scanner.nextInt();
        System.out.println("Digite o curso do aluno: ");
        curso = scanner.next();
        System.out.println("Digite o ano de ingresso do aluno: ");
        anoIngresso = scanner.nextInt();
        System.out.println("Digite a quantidade de disciplinas do aluno: ");
        qtdeDisciplinas = scanner.nextInt();


        Aluno aluno = new Aluno(nome, matricula, curso, anoIngresso, qtdeDisciplinas);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Ano de Ingresso: " + aluno.getAnoIngresso());
        System.out.println("Quantidade de Disciplinas: " + aluno.getQtdeDisciplinas());
        System.out.println("Situação: " + aluno.getSituacao());
        
    }
}
