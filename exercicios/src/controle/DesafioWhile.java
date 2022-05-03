package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("infome a nota (ou -1 p/ sair):\n ");
			nota = entrada.nextDouble();
			
			if(nota <=10 && nota >=0) {
				total += nota;
				quantidadeDeNotas++;
				
			} else if(nota != -1) {
				System.out.println("Nota inválida!!! ;D");
			}
			
		}
		// Calcular a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média= " + media);
		
			// esse ultimo bloco de código so não deu erro porque
		    // foi execultado fora do laço "{}" else if. 
		

		entrada.close();
	}

}
