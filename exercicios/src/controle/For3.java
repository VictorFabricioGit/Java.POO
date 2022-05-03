package controle;

public class For3 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
		
		// Desafio for, não pode usar o valor numérico
		// para controlar o laço
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}

}
