import java.util.Scanner;

public class Principal {

    //  “Faça um programa que receba o salário-base de um funcionário, calcule e mostre o salário
    // a receber. Sabendo-se que esse funcionário tem gratificação de 5% sobre o salário -base
    // e paga imposto de 7% também sobre o salário-base.”
    public static double calculaSalario(double salarioBase) {
      double gratificacao, imposto, salarioFinal;

      gratificacao = calculaGratificacao(salarioBase);
      imposto = calculaImposto(salarioBase, 0.07);

      salarioFinal = salarioBase + gratificacao - imposto;
      return salarioFinal;
    }

    public static double calculaGratificacao(double salarioBase) {
      return salarioBase * 0.05;
    }

    public static double calculaImposto(double salarioBase, double percentualImposto) {
      return salarioBase * percentualImposto;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário base: ");
        double salarioBase = scanner.nextDouble();

        double salarioFinal = calculaSalario(salarioBase);
        System.out.println(salarioFinal);

        scanner.close();
    }
}