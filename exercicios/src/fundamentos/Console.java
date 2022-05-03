package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom ");
		System.out.print("dia\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Mega Sena: %d %d %d %d %d %d %n", 
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1600.40123);
		System.out.printf("Nome: %s%n", "João");
		
		Scanner entrada = new Scanner(System.in); // new Scanner(Sytem.in); serve para
		//capturar a entrada do sistema "teclado".
		
		System.out.print("Digite seu nome: ");
		String	nome = entrada.nextLine(); // entrada.nextLine serve para capturar
		//o que foi digitado na entra do sitema "teclado".
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt(); // entrada.nextInt serve para captura o inteiro
		// digitado na entrada do sistema o mesmo serve para entrada.nextDouble, entrada.nextFloat etc...
		
		System.out.printf("%s %s tem %d anos de idade.", 
				nome, sobrenome, idade);
		
		entrada.close(); // A Advertência do Eclipse some somente após fechar o "Scanner".
		
				
	}

}
