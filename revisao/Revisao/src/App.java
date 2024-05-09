public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int[] vetorNotas = new int[5];
        int nota;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota do aluno: ");
            nota = scanner.nextInt();
            if (nota >= 0 && nota <= 10) {
                vetorNotas[i] = nota;
            } else {
                System.out.println("Nota inválida, digite novamente.");
                i--;
            }
        }

        for (int i=0; i<5; i++) {
            System.out.println("Nota do aluno: " + vetorNotas[i]);
        }




    }
}
