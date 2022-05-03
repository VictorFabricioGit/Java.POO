package classe;

public class DesafioConstrutor2 {
	public static void main(String[] args) {
		
		DesafioConstrutor d1 = new DesafioConstrutor(29, 12, 1991);
		
		DesafioConstrutor d2 = new DesafioConstrutor(); 
		d2.dia = 2; // pode alterar o valor a qualquer momento com a notaçao ponto 
		
	    String dataFormatada1 = d1.obterDataFormatada();
	    System.out.println(dataFormatada1);
	    
        String dataFormatada2 = d2.obterDataFormatada();
        System.out.println(dataFormatada2);
	}

	
	
	
	
}
