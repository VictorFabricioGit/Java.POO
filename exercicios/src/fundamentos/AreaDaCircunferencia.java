package fundamentos;

public class AreaDaCircunferencia {
	public static void main(String[] args) {
		
		double raio = 5.0; // Variavel double número real
		final double PI = 3.14159; // adicionando "Final", torna a variavel em uma constante.
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("area da sala = " + area + "m2"); 
	}

}
