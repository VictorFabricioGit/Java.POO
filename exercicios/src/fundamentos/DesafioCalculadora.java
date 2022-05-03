package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe o número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("informe a operação");
		String op = entrada.next();
		
		// Lógica
		double resultado = "+".equals(op) ?  num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado; // a variável "resultado" pode ser mudada
		resultado = "*".equals(op) ? num1 * num2 : resultado;// sa segunda condição em, diante e comparada
		resultado = "/".equals(op) ? num1 / num2 : resultado;// caso a primeira opção for falsa, retorna
		resultado = "%".equals(op) ? num1 % num2 : resultado;// o resiltado inicial "0"2
		
		System.out.printf("%.2f %s %.2f = %.2f",
				num1, op, num2, resultado);
		 
		entrada.close();
		
	}

}
