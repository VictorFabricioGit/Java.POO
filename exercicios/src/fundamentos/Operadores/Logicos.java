package fundamentos.Operadores;

public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && !condicao2);// e (and)
		System.out.println(condicao1 || condicao2); // ou (or)
		System.out.println(condicao1  ^ condicao2); // ou exclusivo (xor)
		System.out.println(!condicao1); // negação (not) !true = false, !false = true
		System.out.println(!!condicao1);// dupla negação !!true = true, !!false = false
		
		System.out.println("\nTabela verdade 'E' AND");
		System.out.println(true && true);
		System.out.println(true && false);
	//	System.out.println(false && true);
   //   System.out.println(false && false);

		System.out.println("\nTabela verdade 'ou' OR");
	//	System.out.println(true || true);
   //   System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade 'ou exclusivo' XOR");
		System.out.println(true ^ true);
		System.out.println(true ^ false); // quando somente um é  verdadeiro o resultado é true
		System.out.println(false ^ true); // quando os dois são true ou false o resultado é false
		System.out.println(false ^ false);  	
        
		// Operador unário
		System.out.println("\nTabela verdade 'negação' NOT");
		System.out.println(!true); 
		System.out.println(!false);
		
		
	}

}
