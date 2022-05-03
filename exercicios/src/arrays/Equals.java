package arrays;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Victor Fabricio";
		u1.email = "victor.fb@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Victor Fabricio";
		u2.email = "victor.fb@gmail.com";
		
		System.out.println(u1 == u2); // vai dar erro pois o certo e usar .equals
		System.out.println(u1.equals(u2));// mesmo assim  o hashcode precisa ser aplicado
		System.out.println(u2.equals(u1));
		
		//System.out.println(u2.equals(new Date()));
		
	}

}
