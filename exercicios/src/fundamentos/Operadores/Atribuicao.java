package fundamentos.Operadores;

public class Atribuicao {
	
	public static void main(String[] args) {
		// "=" -> operador, "a,b e c" -> operando.	
		int a = 3;
		int b = a;
		int c = a + b;
		
		// Versão reduzida 
		
		c += b; // c = c + b; atribuição aditiva
		c -= a; // c = c - a; atribuição subtrativa
		c *= b; // c = c * b; atribuição mutiplicativa
		c /= a; // c = c / a; atribuição divisora 
		
		System.out.println(c); 
		
		c %= 2; // c = c % 2; atribuição modulo
		// têm como resultado 0 ou 1
       //  0 = "par" ||  1 = "ímpar" 		
		System.out.println(c);
	
		
	}

}
