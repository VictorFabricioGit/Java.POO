package controle;

public class Continue1 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if(i % 2 == 1) {
				continue;
				
			}
			System.out.println(i);
		}
			
		for (int i = 0; i <= 10; i++) {
				
				if(i == 5) continue;
					System.out.println(i);
					
					// Continue e Break raramente é usado em Java
				
		}
	}

}
