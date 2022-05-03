package arrays;


public class Foreach {
	// laço (estrutura de controle) ligada ao Array
	public static void main(String[] args) {
		
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		for (int i = 0; i < notas.length; i++) { // modo sem each
			System.out.print(notas[i] + " ");
		}
		
		System.out.println();
		
		for(double resultado: notas) {
			System.out.print(resultado + " ");
		}
	
	
	
	
	}

}
