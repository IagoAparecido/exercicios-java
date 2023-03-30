public class Arvore {
  public static void main(String[] args) {
    Pessoa filho = new Pessoa();
    Pessoa mae = new Pessoa();
    Pessoa pai = new Pessoa();

    mae.nome = "Mae";
    pai.nome = "Pai";
  
    filho.nome = "Iago";
    filho.idade = 21;
    filho.mae = mae.nome;
    filho.pai = pai.nome;

    System.out.println(filho.ResumoPessoa());
  }
}
