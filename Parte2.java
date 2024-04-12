import java.util.Scanner;

public class Parte2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o valor de x: ");
    double x = scanner.nextDouble();
    System.out.println("Informe o valor de y: ");
    double y = scanner.nextDouble();
    System.out.println("Informe a operação que deseja realizar: ");
    String operacao = scanner.next();

    double resultado;
    switch (operacao) {
      case "+":
        resultado = soma(x, y);
        System.out.println(soma(x, y));
        break;
      case "-":
        subtracao(x, y);
        break;
      case "*":
        multiplicacao(x, y);
        break;
      case "/":
        divisao(x, y);
        break;
      default:
        break;
    }
  }

  public static double soma(double x, double y) {
    return x + y;
  }

  public static double subtracao(double x, double y) {
    return x - y;
  }

  public static double multiplicacao(double x, double y) {
    return x * y;
  }

  public static double divisao(double x, double y) {
    return x / y;
  }


}
