package oo.heranca;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;

		Heroi heroi = new Heroi(10, 11);// chamando o construtor padrão
		
	
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " +heroi.vida + "\n");
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.vida);
	    System.out.println("Heroi tem => " +heroi.vida);
	
	}

}
