package arrays;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.print("quantidade de notas: ");
		 
		 int qtdNotas = entrada.nextInt();
		 double[] notas = new double[qtdNotas];
		 
         for(int i = 0; i < notas.length; i++) {
        	 System.out.print("informe a nota " + (i + 1) + ": ");
        	 notas[i] = entrada.nextDouble();
        	 
         }

         double total = 0;
         for(double nota: notas) {
        	 total += nota;
        	 
         }
         double media = total / notas.length;
         System.out.println("Media = " + media);
         
	    entrada.close();
	       
	}

}
