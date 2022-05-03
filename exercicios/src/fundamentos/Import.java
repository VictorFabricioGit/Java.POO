package fundamentos;

import java.util.Date;

import javax.swing.JButton;

public class Import {
	public static void main(String[] args) {

		//Tudo que está fora de java lang deve ser importado.
		
		java.lang.String b = "Hey Man how you doing"; 
		java.lang.System.out.println(b);
		
		String s = "I'm fine and you"; //não foi necessário importar
		System.out.println(s);         //String está dentro de Java lang.
		
		//foi necessário importar, pois, Date não está dentro de java lang.
		// Ctrl + shift + o, ativa automaticamente os imports necessarios ou desnecessarios.
		
		Date d = new Date();
		System.out.println(d);
		
		// Outro exemplo.
		
		JButton botão = new JButton();
		System.out.println(botão);

	}

}
