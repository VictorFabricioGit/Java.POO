package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		System.out.println("2" == "2");//  deu true mas não é interressante do ponto de vista
		// prático, pois, ao atribuir um novo valor em new String vai dar false, sendo assim, é
		// necessário usar a notação ponto ".equals"
		
		String s1 = new String ("2");
		System.out.println("2" == s1);// o resultado é false, pois, nem toda vez é
	    //possivel comparar duas ou mais depende Strings, existe uma maneira certa.
		// É possível usar a notação ponto para comparar ultilizando .equals
		 
		System.out.println("2".equals(s1));
		//outro exemplo:
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next(); //".next" não considera os espaços em branco
		// digitados no console, nesse caso, se utiliza a função ".trim" que 
		// desconsidera os espaços em branco. Vale destacar que ".nextln" 
		// desconsidera os espaços em branco, portanto, não é necessário usar ".trim"
		 
		System.out.println("2" == s2.trim()); //false
		System.out.println("2".equals(s2.trim()));// true porquê a função .equals foi usada
		
		entrada.close(); 
	}
}
