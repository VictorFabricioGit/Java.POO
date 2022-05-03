package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
			String valor = JOptionPane.showInputDialog(
					"Informe o número");
			int numero = Integer.parseInt(valor);
			
			if(numero % 2 == 0) {
				System.out.println("Número par");
			} else {
				System.out.println("Número ímpar");
			}
			
			// Não hà necessidade de usa If para uma condição binária 
			// escrevendo duas sentençãs de código basta usar o If
			// para true e depois usar o else para false.
	}

}
