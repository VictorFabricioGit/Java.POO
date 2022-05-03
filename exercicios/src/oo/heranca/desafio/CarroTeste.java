package oo.heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		
		Civic c1 = new Civic();
		
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1 +"\n");
		
		Carro c2 = new Ferrari(); // carro c2 é um tipo mais genérico nada impede de chamar um tipo 
		// mais especifico como Ferrari c2 = new Ferrari();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		System.out.println(c2);
		c2.frear();
		System.out.println(c2);
		c2.frear();
		System.out.println(c2);
		
	}
}
