package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>(); // <> define o tipo de dado usado na lista
		SortedSet<String> listaAprovados = new TreeSet<String>();// lista em ordem
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidatos: listaAprovados) { // usa foreach para percorres a lista
			System.out.println(candidatos);      // mas ele nao segue a ordem, para ser
		} // ordenado precisa usar TreeSet = new TreeSet ou sortdeSet = new TreeSet
	
        Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for (int numeros: nums) {
			System.out.println(numeros);
		}
	}

}
