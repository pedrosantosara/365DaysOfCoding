public class exercise01 {
  public static void main(String[] args) {
    import java.util.Scanner;
    Scanner scan = new Scanner(System.in);

    System.out.println("Insira a idade em anos: ");
    int anos = scan.nextInt();

    System.out.println("Insira a idade em meses: ");
    int meses = scan.nextInt();

    System.out.println("Insira a idade em dias: ");
    int dias = scan.nextInt();

    int idadeEmDias = (anos * 365) + (meses * 30) + dias;

    System.out.println("A idade expressa em dias é: " + idadeEmDias);
  }

}
