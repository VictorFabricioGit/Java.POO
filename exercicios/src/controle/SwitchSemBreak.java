package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		// if(boolean)...
		// while(boolean)...
		// for(;boolean;)..
		// switch sem break raramente é usado em 99% das vezes usa switch com break
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()){ //Não recebe boolean v ou f, recebe diretamento
		                             // o valor
		case "preta":
			System.out.println("sabe bater");
		case "verde":
			System.out.println("sabe chutar");
		case "laranja":
			System.out.println("sabe rolar");
	
		}
		int idade = 3;
		
		switch (idade) {
		case 3:
			System.out.println("sabe progamar");
		case 2:
			System.out.println("sabe andar");
		case 1:
			System.out.println("sabe respirar");
			
			
		}
		
	}

}
