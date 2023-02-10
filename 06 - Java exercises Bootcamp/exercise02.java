public class exercise02 {
    public static void main(String[] args) {
      double primeiraMedia = (8 + 9 + 7) / 3.0;
      double segundaMedia = (4 + 5 + 6) / 3.0;
      double somaDasMedias = primeiraMedia + segundaMedia;
      double mediaDasMedias = somaDasMedias / 2.0;
  
      System.out.println("A média dos números 8, 9 e 7 é: " + primeiraMedia);
      System.out.println("A média dos números 4, 5 e 6 é: " + segundaMedia);
      System.out.println("A soma das duas médias é: " + somaDasMedias);
      System.out.println("A média das médias é: " + mediaDasMedias);
    }
}
