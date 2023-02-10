public class exercise03{
  public static void main(String[] args) {
  import java.util.Scanner;
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira a porcentagem do IPI: ");
    double porcentagemIPI = scan.nextDouble();

    System.out.println("Insira o código da peça 1: ");
    int codigoPeca1 = scan.nextInt();
    System.out.println("Insira o valor unitário da peça 1: ");
    double valorUnitarioPeca1 = scan.nextDouble();
    System.out.println("Insira a quantidade de peças 1: ");
    int quantidadePeca1 = scan.nextInt();

    System.out.println("Insira o código da peça 2: ");
    int codigoPeca2 = scan.nextInt();
    System.out.println("Insira o valor unitário da peça 2: ");
    double valorUnitarioPeca2 = scan.nextDouble();
    System.out.println("Insira a quantidade de peças 2: ");
    int quantidadePeca2 = scan.nextInt();

    double valorTotalPeca1 = valorUnitarioPeca1 * quantidadePeca1;
    double valorTotalPeca2 = valorUnitarioPeca2 * quantidadePeca2;
    double valorIPI = (valorTotalPeca1 + valorTotalPeca2) * (porcentagemIPI / 100.0);
    double valorFinal = valorTotalPeca1 + valorTotalPeca2 + valorIPI;

    System.out.println("O código da peça 1 é: " + codigoPeca1);
    System.out.println("O valor total da peça 1 é: " + valorTotalPeca1);
    System.out.println("O código da peça 2 é: " + codigoPeca2);
    System.out.println("O valor total da peça 2 é: " + valorTotalPeca2);
    System.out.println("O valor do IPI é: " + valorIPI);
    System.out.println("O valor final é: " + valorFinal);
  }
}

