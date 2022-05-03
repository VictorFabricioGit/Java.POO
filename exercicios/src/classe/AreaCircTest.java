package classe;

public class AreaCircTest {
	public static void main(String[] args) {
		
    AreaCirc a1 = new AreaCirc(5);
    
    AreaCirc a2 = new AreaCirc(5);
    
    System.out.println(a1.area());
    System.out.println(a2.area());
    
    System.out.println(AreaCirc.PI); // chama diretamente o atributo da classe AreaCirc
    // nada impede de criar um atributo de instância passando outro valor para PI
    // mas o comum é ultilizar um atributo constante usando o static
	
	System.out.println(AreaCirc.area(100)); // metodo da istância
    
	}

     
	
}
