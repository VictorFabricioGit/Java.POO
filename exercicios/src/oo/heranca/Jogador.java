package oo.heranca;

public class Jogador {
	
	int vida = 100;
	int x;
	int y;
	
	
	Jogador(int x, int y){ 
		this.x = x;        
		this.y = y;
		
	}
	
	boolean atacar(Jogador oponente) {// como jogador foi ligado a oponente a herança heroi e monstro nao vai dar conflito
		int deltaX = Math.abs(x - oponente.x); // Math.abs mesmo de a difença for -1 o metodo vai 
		int deltaY = Math.abs(y - oponente.y); // retornar como 1, ou seja, o valor absoluto.
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
				
		} else {
			return false;
		}
	}
	boolean andar(Direcao direcao) {
    
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
	
	}//..
		
		
		return true;
		
	}

}
