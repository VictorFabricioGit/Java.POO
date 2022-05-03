package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
	   Produto p1 = new Produto("notbook = ", 4356.89); 
	   // foi criado um tipo na classe produto com 3 variaveis
	  // nome, preco e desconto e essas variáveis pertencem ao objeto
	  // para acessarmos os atributos da classe usamos a notação ponto
	   
	   
	   var p2 = new Produto(); // a classe define o tipo de instância. Para atribuir uma 
	   p2.nome = "caneta preta = ";// nova instância usamos o construtor "new", assim ele se
	   p2.preco = 12.50;  // se torna um metodo por isso tem "()" em seguida
	   
	   Produto.desconto = 0.29;
	   
	   System.out.println(p1.nome + "" + p1.precoComDesconto());
	   System.out.println(p2.nome + "" + p2.precoComDesconto());   
	   
	   double precofinal1 = p1.precoComDesconto(); // valor refatorado, foi criado um metodo"()"
	   double precofinal2 = p2.precoComDesconto(); // preço com desconto
	   double mediaCarrinho = (precofinal1 + precofinal2) / 2;
	   System.out.printf("media do carrinho = %.2f", mediaCarrinho); 
	   
	} 

}
