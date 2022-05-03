package fundamentos.Operadores;

public class DesafiosLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = true; // shift + alt + a edita várias linha ao mesmo tempo 
		boolean trabalho2 = false;
		
		var comprouTV50 = trabalho1 && trabalho2;
	    var comprouTV32 = trabalho1 ^ trabalho2;
		var comprouSorvete = trabalho1 || trabalho2; 
	    // Operador unário
		var maiSadavel = !comprouSorvete;	
		
		System.out.println("comprou tv50?: " + comprouTV50);
		System.out.println("comprou tv32?: " + comprouTV32); 
		System.out.println("comprou sorverte?: " + comprouSorvete);
		System.out.println("mais saudável: " + maiSadavel);
		 
		
	}

}
