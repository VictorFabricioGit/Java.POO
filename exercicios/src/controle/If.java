package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		float media = entrada.nextFloat();
		
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado!!!"); 
			System.out.println("Parabéns!!!"); 
		}
		
		if(media < 7 && media >= 4.5) {        // If não têm ; após o código apenas "{}"
			System.out.println("Recuperação"); // entre as sentenças, isso serve para todas
		}                                      // as estruturas de controle com uma excessão.
		
		// Outra maneira de fazer
		
		{
			boolean criterioDeReprovacaoAtingido = 
					media < 4.5 && media >= 0;
					if(criterioDeReprovacaoAtingido)
					System.out.println("Reprovado");
		}
		
		entrada.close();
	}

}
