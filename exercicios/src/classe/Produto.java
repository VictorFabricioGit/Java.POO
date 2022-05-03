package classe;

public class Produto {
	
	String nome;
	double preco;
    static double desconto = 0.25;
    	
    Produto (){
    	
    }

    
    Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		
	// Crinado um construtor se perde o construtor padrão
	// no entranto pode-se criar outro construtor padrão
	}// como no exemplo abaixo
	
	
	double precoComDesconto() {
		return preco * (1 - desconto);
		
	}
	 double produtoComDesconto(double desconDoGerente) {
		 return preco * (1 - desconto + desconDoGerente);
	}
 
}
