package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		//byte
		Byte b = 100;
		//short
		Short s = 1000;
		//int
		Integer i = 10000; // único que é diferente na escrita int = tipo primitivo
		// Integer = Wrapper
		
		//long
		Long l = 100000L;// para atribuir comportamentos aos Wrappers é necessário que 
	    // a primeira letra tem que ser "Maiuscula" -> long = tipo primitivo
		// Long = Warpper -> pode atribuir comportamentos com notaçãom ponto
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); // converteu boolean para o valor string
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // converteu valor boolean para string
		// depois de converter para string pode passar qualquer atributo de classe string 
		
		//char 
		Character c = 'a'; // Character também é diferente na escrita
		System.out.println(c.toString().concat("BC").toUpperCase()
				+ "!!!");
		}

}
