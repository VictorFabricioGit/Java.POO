package controle;

import java.util.Scanner;

public class DesafioIFElse {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 System.out.print("Digite o nome do dia: ");
		 
		 String dia = entrada.next();
		 
		
		 
		 if(dia.equalsIgnoreCase("Domingo")){ // dia == Domingo vai dar err
			 System.out.println(1);// para igualar duas strings precisa 
		 }                         // da notação .equalsIgnoreCase
		 
		 else if(dia.equalsIgnoreCase("Segunda")) {
			 System.out.println(2);
		 } else if(dia.equalsIgnoreCase("Terça")) {
			 System.out.println(3);
		 } else if(dia.equalsIgnoreCase("Quarta")) {
			 System.out.println(4); 
		 } else if(dia.equalsIgnoreCase("Quinta")) {
			 System.out.println(5);
		 } else if(dia.equalsIgnoreCase("Sexta")) {
			 System.out.println(6);
			 
			 //outra maneira
		 } else if("Sabado".equalsIgnoreCase(dia)) {
			 System.out.println(7);
		 } else {
			 System.out.println("Nome errado, digite novamente: ");
		 }
		 
		entrada.close();
	}

}
