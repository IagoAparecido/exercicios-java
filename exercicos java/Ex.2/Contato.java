public class Contato {
  String telefone;
  String nome;

  String ResumoAgenda() {
    return "Nome: "+ nome + "\n" +
          "Telefone: " + telefone + "\n" +
          "-----------------------";
  }
}
