import java.util.Scanner;

public class ProgramaCompra {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Produto produto = new Produto();

    System.out.println("Nome do produto comprado: ");
    produto.nome = scan.nextLine();

    System.out.println("Valor do produto: ");
    produto.preco = scan.nextDouble();

    System.out.println("Quantidade do produto: ");
    produto.quantidade = scan.nextInt();

    produto.calculoTotal(produto.quantidade);

    System.out.println(produto.ResumoProduto());
  }
}
