package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // conversão de double para int "implícita" 
		System.out.println(a); // como int é menor que float não ouve perca de informação
		
		float b = (float) 1.23456789999; // para deixar aconvesão de forma
		//explicita (CAST) adiciona (float) antes do valor 1.23456789999.
		
		System.out.println(b); // conversão de double para float "explícita" (CAST),
		// como o valor double é maior que float ouve perca de informação
		
		int c = 240; // como o valor int é maior que byte ouve perca de informação
		byte d = (byte) c; // conversão "explícita" (CAST), quando voce declara a
		// conversão de forma explícita o java está ciente que você sabe que pode
		// haver perca de informação
		System.out.println(d);
		
		double e = 1.999999; // converão explícita (CAST) na conversão de double
		int f = (int) e; // para int o java considera apenas o número inteiro "1",
		System.out.println(f);// desconsiderando as casas decimais após a virgula.
		
		
		
	}

}
