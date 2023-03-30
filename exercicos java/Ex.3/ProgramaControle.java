public class ProgramaControle {
  public static void main(String[] args) {
    Emprestimo emprestimo = new Emprestimo();

    emprestimo.pessoa.nome = "Iago";
    emprestimo.pessoa.idade = 21;

    emprestimo.livro.nome = "Dracula";

    emprestimo.situacao = "Não devolvido";

  System.out.println("---------------------");
  System.out.println("Nome: " + emprestimo.pessoa.nome);
  System.out.println("Idade: " + emprestimo.pessoa.idade);
  System.out.println("Livro emprestado: " + emprestimo.livro.nome);
  System.out.println("Situacao do empréstimo: " + emprestimo.situacao);
  System.out.println("---------------------");
}
}
