import java.util.Scanner;

public class Agenda {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Contato contato = new Contato();

    System.out.println("-------------");
    System.out.println("Digite o nome: ");
    contato.nome = scan.nextLine();

    System.out.println("Digite o telefone: ");
    contato.telefone = scan.nextLine();
    System.out.println("-------------");


    System.out.println(contato.ResumoAgenda());
  }
}