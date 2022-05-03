 package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		// if(...) senteça; ou {}
		// while(...) sentença; ou {}
		// for(...;...;..) senteça ou {}
		
		// do senteça; ou {} while(...); único que termina com ;
		
		Scanner entrada = new Scanner(System.in); // em templates tem a opção
		                                          // de crir linhas ou bloco de código
		
		String texto = "por favor";
		 do {
			 System.out.println("Você precisa falar"
			 		+ " a palavra mágica");
			 System.out.println("você quer sair? ");
			 
			 texto = entrada.nextLine();
		 } while(!texto.equalsIgnoreCase("por favor"));
		 
		 System.out.println("Obrigado!!!"); // se o código iniciar com por favor no "do while" mesmo assim 
		 // o código vai ser executado pelomenos uma vez dirente do "for" e "while"

		

		entrada.close();
	}

}
