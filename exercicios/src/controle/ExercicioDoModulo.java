package controle;

import java.util.Scanner;

public class ExercicioDoModulo {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		int contadorDeNumero = 0;
		
		System.out.println("Digite o número para saber se é primo");
		
		int numero = entrada.nextInt();
		 for (int i = 0; i < numero; i++) {
			 if (numero % 1 == 0) {
				 contadorDeNumero++;
			 }
		 }
		 switch (contadorDeNumero) {
		 case 0:
			 System.out.println("O número " +  numero + " é Primo");
			 break;
		 default:
			 System.out.println("o número " + numero + " não é primo");
		 }
		 

		

		entrada.close();
	}

}
