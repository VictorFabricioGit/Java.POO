package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Informe a quantidade de alunos? : ");
		int qtdAluno = entrada.nextInt();

		System.out.print("Quantas notas por aluno? : ");
		int qtdNotas = entrada.nextInt(); 
		
		double[][] notasDaTurma = new double[qtdAluno][qtdNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				
				System.out.printf
				("informe a nota %d do aluno %d: ", a+1, n+1); //+1 para começar a contagem do 1
				
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];	
			}
		}
		double media = total / (qtdAluno * qtdNotas);
		System.out.println("a média da turma é: " + media);
		
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}

		entrada.close();
	}

}
