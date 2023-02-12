public class TestaContaBancaria {
    public static void main(String[] args) {
      ContaBancaria c1 = new ContaBancaria();
      c1.setNomeDoTitular("João");
      c1.depositar(1000);
      c1.imprimeSaldo();
  
      ContaBancaria c2 = new ContaBancaria();
      c2.setNomeDoTitular("Maria");
      c2.depositar(500);
     
  