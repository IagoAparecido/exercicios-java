public class Pessoa {
  String nome;
  String mae;
  String pai;
  int idade;

  String ResumoPessoa() {
    return 
    "Nome: " +nome + "\n"+ 
    "Idade: " + idade + " anos" + "\n" + 
    "Mae: " + mae + "\n" + 
    "Pai: "+ pai;
  } 
}