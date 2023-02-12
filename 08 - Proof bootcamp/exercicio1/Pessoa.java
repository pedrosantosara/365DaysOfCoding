public class Pessoa {
    private String nome;
    private int idade;
  
    public void imprime() {
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
    }
  
    public void setNome(String nome) {
      this.nome = nome;
    }
  
    public void setIdade(int idade) {
      this.idade = idade;
    }
  }
  
 