package fundamentos;

public class NotaçãoPonto {
	public static void main(String[] args) {
		
		String s = ("Bom dia X");
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		System.out.println(s);
		
		// another Way
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		// another Way
		
		String z = "Bom dia X"
				.replace("X", "Minha Filha")
				.toUpperCase()
				.concat("!!!");
		System.out.println(z);
		
		//Tipos Primitivos não tem a notação ponto "."
		
		//int a = 3
			//.a 
				
				// não vai aparecer nenhuma sujestão, pois, nos tipos
			    // primitivos, não existe comportamentos ou atributos associados
			    // apenas valores definidos como inteiros, boleano, char etc...
	}

}
