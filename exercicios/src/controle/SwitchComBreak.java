package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		// Forma mais usada
		Scanner entrada = new Scanner(System.in);

		String conceito = "";
		System.out.print("digite a nota: ");
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10: 
		case 9:             // em java não permite adicionar um intervalo de case
			conceito = "A"; // ex: do 5 ao 10, pode ser declarado na mesma linha
			break;          // mas tem que ser declarado de 1 em 1. o case também
		case 8: case 7:     // não pode ser duplicado.
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3: case 2: case 1: case 0:
			conceito = "D";
			break;
			default:
				conceito = "não encontrado";
		}
		System.out.println("conceito : " + conceito);

		entrada.close();
	}

}
