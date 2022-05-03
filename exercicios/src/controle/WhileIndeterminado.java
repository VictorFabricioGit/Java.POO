package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) { // ! antes diz que se o valor atribuido
			System.out.println("Você diz: "); // a string "sair" não for execultado 
			                                 // o comando não para de ser executado
			
			valor = entrada.nextLine();
		}
		
		entrada.close();
	}

}
