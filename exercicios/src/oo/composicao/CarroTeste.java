package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros()); // Acesso a classe Motor e com a notação ponto .giros
	    // teve acesso ao metodo giros associado a classe motor
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		// relação bidirecional so é usada em casos especificos normalmente se usa unidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.carro.motor.giros());
		
		//faltou encapsulamento!!!
		//c1.motor.fatorInjecao = -30;
		
		System.out.println(c1.motor.giros());
	}

}
