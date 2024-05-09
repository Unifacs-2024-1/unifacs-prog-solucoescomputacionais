// beecrowd | 1181
// Neste problema você deve ler um número, indicando uma linha da matriz na qual uma operação deve ser
// realizada, um caractere maiúsculo, indicando a operação que será realizada, e todos os elementos de uma
// matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média dos elementos que estão na área verde da
// matriz, conforme for o caso. A imagem abaixo ilustra o caso da entrada do valor 2 para a linha da matriz,
// demonstrando os elementos que deverão ser considerados na operação
public class App {
    public static void main(String[] args) throws Exception {
        int linha;
        char operacao;
        System.out.println("Digite um numero da linha: ");
        // ler um numero
        linha = new java.util.Scanner(System.in).nextInt();
        System.out.println("Digite qual operação irá realizar: ");
        operacao = new java.util.Scanner(System.in).next().charAt(0);
        // criar uma matriz 12x12
        double[][] matriz = new double[12][12];
        // ler os valores da matriz
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = new java.util.Scanner(System.in).nextDouble();
            }
        }
        // criar uma variavel para armazenar a soma
        double soma = 0;
        // percorrer a matriz
        for (int j = 0; j < 12; j++) {
            // verificar se o elemento esta na area verde
            if (i > 0 && i < 11 && j > 0 && j < 11) {
                // somar o elemento
                soma += matriz[linha][j];
                // incrementar a quantidade
                quantidade++;
            }
        }

        // verificar se a operacao e soma
        if (operacao == "S") {
            // imprimir a soma
            System.out.printf("%.1f\n", soma);
        } else {
            // imprimir a media
            System.out.printf("%.1f\n", soma / quantidade);
        }
        

    }
}
