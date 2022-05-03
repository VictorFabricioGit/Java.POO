package classe;

public class AreaCirc {
	
	double raio; // Adicionando static antes do tipo da classe, ou seja, antes de double PI
	final static double PI = 3.1415; // quase sempre o tipo se torna uma constante final reforça isso
	
    AreaCirc(double RaioInicial) { 
    
		raio = RaioInicial;
		
	}

	double area() {
		return PI * Math.pow(raio, 2);
		
	}
	
	static double area(double raio){ // metodo que pertence a instancia 
		return PI * Math.pow(raio, 2);
		
	}
}
