package fundamentos.Operadores;

public class Unario {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1 -> incremento pós-fixado
		a--; // a = a - 1 -> decremento pós-fixado
		
		++b; // b = b + 1 -> incremento prefixado
		--b; // b = b - 1 -> decremento prefixado
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio...");
		System.out.println(++a == b--); // neste caso específico a resposta é false
		// pelo falor de que o incremento prefixado tem prioridade de execução, ou 
		// seja, ++a é igual "á" 2 que é igual a "b" somente após essa na proxíma
		// linha o java vai considerar o -- da variável "b" ex:
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
