package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		 
		List<Usuario> lista = new ArrayList<Usuario>();

        Usuario u1 = new  Usuario("Ana");	
		
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

	    System.out.println(lista.get(3).nome); // lista.get captura o usuário pelo indice
        lista.remove(1); // remover pelo Ídice "Carlos"
	    lista.remove(new Usuario("Manu"));// remoção peli usuário
	    
	    System.out.println("tem? " + lista.contains(new Usuario("Lia"))); // contem verdadeiro ou falso
	    
	    
        
        for(Usuario u: lista) {
	    	System.out.println(u);
	    }
	}

}
