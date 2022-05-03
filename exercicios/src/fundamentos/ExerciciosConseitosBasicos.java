package fundamentos;

import java.util.Scanner;

public class ExerciciosConseitosBasicos {
	public static void main(String[] args) {
		
		// 1) (F - 32) * 5/9 = c
		
		double fire = 50;
		final double constante1  = 32;
		final double constante2 = 5/9.0;
		double celcios = (fire - constante1) * constante2;
		
		System.out.println(celcios);  
 
		// 2)  F = C * 1.8 + 32
		
		double celcios2 = 100;
	    double  constante3 = 1.8;
		double constante4 = 32;
		double fire2 = (celcios2 * constante3) + constante4;
		
		System.out.println(fire2); 
		
		// 3) calcule o IMC Peso / altura * 2
		
		double peso = 80;
		double altura = 1.73;
		altura = Math.pow(altura, 2);
		
		double resultado = peso / altura;
		
		System.out.printf("%.2f\n", resultado);
		
		
		
		// 4) x² && x³
		
		Scanner  entrada = new Scanner(System.in);
		System.out.println("digite o número: ");
		double num1 = entrada.nextDouble();
		System.out.println(num1 + "²= " + Math.pow(num1, 2)
		+ "\n" + num1 + "³= " + Math.pow(num1, 3));
		
		entrada.close();
		
		// 5) Área do triângo
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Digite o valor da base: ");
		double base = entrada2.nextDouble();
		
		System.out.println("digite o valor da altura: ");
		double altura2 = entrada2.nextDouble();
		
		double resultado2 = (base * altura2) / 2;
		
		System.out.println("Área= " + resultado2 + "M²"+ "\n");
		
		entrada2.close();
		
		// 6) calcule a expressão de segudo grau: ax2 + bx + c = 0
		// a = 1 b = 12 e c = -13
		// /\ = b² - 4 * a * c
		
		double b = 12;
		final double constante5 = 4;
		double a = 1;
		double c = -13;
		
		double resultado10 = Math.pow(b, 2) - constante5 * a * c;
		
		System.out.println(resultado10);	
		
		
	}

}
