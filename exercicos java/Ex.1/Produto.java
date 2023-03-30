public class Produto{
  String nome;
  double preco;
  int quantidade;
  int desconto;
  double precoTotal;

  void calculoTotal(int quantidade) {

    if (quantidade <= 10) {
      precoTotal = quantidade * preco;
      desconto = 0;
    } 
    else if (quantidade > 10 && quantidade <=20) {
      precoTotal = (quantidade * preco) - (((quantidade * preco) * 10) / 100);
      desconto = 10;
    }
    else if (quantidade > 20 && quantidade <=50) {
      precoTotal =(quantidade * preco) - (((quantidade * preco) * 20) / 100);
      desconto = 20;
    }
    else {
      precoTotal =(quantidade * preco) - (((quantidade * preco) * 25) / 100);
      desconto = 30;
    }
  }

  String ResumoProduto() {
    return "Produto: " + nome + "\n" +
           "Quantidade: "+ quantidade + "\n" +
           "Preco: "+ preco + "\n" +
           "Valor total a ser pago:" + precoTotal + "\n" +
           "Desconto de: " + desconto + "%";
  }
}