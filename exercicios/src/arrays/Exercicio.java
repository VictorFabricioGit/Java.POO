package arrays;

import java.util.Arrays;

public class Exercicio {
 // Array é um conjunto de dados acessado através de um índice 
 // têm o tamanho fixo e é uma estrutura homogênea, ou seja, aceita
 // apenas um tipo, int, double, string etc..
 // é representado por um par de [] depois do tipo -> double[] 
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		// Arrays.toString apresenta todas as instâncias de arreis do 1 ao 3
		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); // para acessar a ultima nota da lista
		//System.out.println(notasAlunoA[4]); Erro pois é maior que o número do arrei
		
		// usando laço para percorrer todo o Array
		double totalAlunoA = 0; // refactor + rename renomeia todas as vairiáveis ao mesmo tempo
		for (int i = 0; i < notasAlunoA.length; i++) {// em vez de usar < 3 usamos o atributo
			totalAlunoA += notasAlunoA[i];// .length para idendificar a quantidade de notas
			}
		System.out.println(totalAlunoA / notasAlunoA.length); // para calcular a média
		
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10}; // usa ponto e virgula. metodo direto mas pouco usado
		// pois geralmente se usa dados de uma lista...
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) { // usa colchete
			totalAlunoB += notasAlunoB[i];
			
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
	  
		
	}
}
