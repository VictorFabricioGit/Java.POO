package classe.Desafio;

public class Janta {
	public static void main(String[] args) {
		
		DesafioNomePeso p1 = new DesafioNomePeso();
		Comida c1 = new Comida();
		
		p1.peso = 82;
		c1.arroz = 0.1;
		c1.feijao = 0.2;
		
		double pesoTotal = p1.peso + c1.arroz + c1.feijao;
		
         
         System.out.println(p1.nome +
        		 " = "+ p1.peso + "Kg");
         
         
         System.out.println("Almoço = arroz " + c1.arroz + 
        		 "kg + feijão " + c1.feijao + "Kg");
         
         System.out.println("peso total após almoço = " + pesoTotal);
         
         
	}
	
	
	

}
