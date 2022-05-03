package controle;

public class ContinueRotulado {
	// Lembrando que Continue e break raramente são usados
	public static void main(String[] args) {
		
		externo:
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if(i == 1) {
						continue externo; // vai pular o [1 0], [1 1]...
					}
					System.out.printf("[%d %d]", i, j);
				}
				System.out.println();
			}
		System.out.println("Fim!!!");
	}

}