package classe;


public class DesafioTrauma {
	
	int a = 3;
	static int b = 4;
	
	public static void main(String[] args) {
			
		 DesafioTrauma d1 = new DesafioTrauma(); // mebro de classe  so pode ser acessado 
		 // por um construtor de classe usando o atributo com a notação ponto, pois passa
		 // a ser um mebro de instância
		 
		 System.out.printf("%d\n", d1.a);
		 
		 System.out.println(b); // usando static acessa um mebro da classe
         
		 
		 
		
		
		}

}
