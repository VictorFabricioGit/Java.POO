package fundamentos.Operadores;

public class Ternario {
	public static void main(String[] args) {
		// Atribuição condicional
		
		double media = 7.6; //expressão/ "?" separa a expresão dos dois valores atribuidos
		String resultadoParcial = media >= 5.0 ? "recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;		
		                                 // ":" separa os valores verdadeiro, "aprovado"
		                                //  de falso "recuperação"
		
		System.out.println("O aluno está em ".concat(resultadoFinal));
		System.out.println("O aluni está em " + resultadoFinal);
		
		
		double  nota = 9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.println("Tem desconto?" + resultado);
		
		//or
		System.out.printf("Tem desconto? %s", resultado);
		
	}

}
