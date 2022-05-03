package fundamentos.Operadores;

public class Aritimeticos {
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); // conversão (CAST) int para double
		System.out.println(a / (float) b);  // conversãp (CAST) int pra float
		
		System.out.println(a % b); // Operador modulo mostra apenas o resto da divisão
		System.out.println(8 % 3); // ou seja, 8/3 = 2 com resto 2, apresenta apenas o resto.
		
		System.out.println(x + y - a * b);
		

	}
}
