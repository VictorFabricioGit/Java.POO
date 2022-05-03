package fundamentos;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		
		String  s = "Texto" // Assim como  public class PrimitivovsObjeto a String também é uma classe
		// A partir do momento que você atribui o valor "Texto" a classe String "s"
		// esse valor passa a se chamar "objeto", ou seja, assiciado ao "s" temos um valor 
		// "Texto" e esse objeto tem atributos e comportamentos como a notação ponto ex:
		.concat("!!!")
		.toUpperCase();

		System.out.println(s);
		// De um lado temos os tipos primitivos, do outro lado
		// tudo que não é do tipo primitivo, chamamos de obejto.
		// sendo assim, nos tipos primitivos não temos valores ou
		// comportamentos associados, no entanto, temos os "Wrappers".
        // que por sua vez atribui, comportamentos aos tipos Primitivos.
		
		// Wrappers são a versão objeto dos tipos primitivos.
	}

}
