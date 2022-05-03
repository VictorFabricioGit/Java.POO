package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5; // declaração e inicialização
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		// a = "...";
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		c = "outro texto";
		System.out.println(c);
		// C = 4.5; vair dar erro porquê  "var c" foi declarado como texto
		// diferente de double nao aceita outra variavel que não seja string
		
		double d; // variável foi declarada 
		d = 123.65;// variável foi inicializada
		System.out.println(d);// variável foi usada
		
		var e = 123.45;
		System.out.println(e);
		
		//var f = 12; vai dar erro pois um inteiro nao cabe dentro de um racional
		//f = 12.01; vai dar erro pois em "var" a variável precisa ser declarada
		// e inicializada na mesma linha
		//para se definir uma variável ou uma constante em java você precisa
		//obrigatoriamente dizer o tipo, string, inteiro, double etc...
		
		
		
		
 		
		
		
				
	}

}
