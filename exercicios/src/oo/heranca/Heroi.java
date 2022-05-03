package oo.heranca;

public class Heroi extends Jogador { // a palavra reservada "extends"
	// liga a classe "Heroi" a classe "Jogador" por herança sendo "Jogador" a classe pai
	
	
	public Heroi(int x, int y){ // chamada explícita sempre que a classe pai
		super(x, y);            // não tiver o construtor padrão definido.
 
	}
	
	boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente); // palavra reservada "super." chama a metodo "atacar"
		boolean ataque2 = super.atacar(oponente); // dentro da classe pai "Jogador" sem necessariamente
		boolean ataque3 = super.atacar(oponente); // sobrescrever todo o código.
		return ataque1 || ataque2 || ataque3;
		
		
	
	}

}
