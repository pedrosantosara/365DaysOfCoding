public class ContaBancaria {
    private String nomeDoTitular;
    private double saldo;
  
    public void depositar(double valor) {
      saldo += valor;
    }
  
    public void retirar(double valor) {
      saldo -= valor;
    }
  
    public void imprimeSaldo() {
      System.out.println("Saldo: " + saldo);
    }
  
    public void setNomeDoTitular(String nomeDoTitular) {
      this.nomeDoTitular = nomeDoTitular;
    }
  }
  
  