package colecoes;

import java.util.HashSet;
import java.util.Set;
// dados Heterogêneos vai dar advertência, não é prático do ponto de vista de organização
public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" }) // Ctrl + 1 remove as advertências 
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);// Mesmo não aceitando tipos primitivos ele
		conjunto.add(true); // faz a conversão automaticamente double -> Double
		conjunto.add("Teste");
		conjunto.add(1); // int -> Interger
		conjunto.add('x'); // char -> character
		
		System.out.println("Tamanho é " + conjunto.size()); // diferente de String e Array não tem .length
		// ultiliza .size para saber o tamanho
		
		conjunto.add("Teste"); // O tamanho do conjunto não vai mudar porquê 
		conjunto.add('x'); // A String Test já existe 
		System.out.println("Tamanho é " + conjunto.size());
		
        System.out.println(conjunto.remove("teste")); // vai dar false porquê teste com t minusculo não existe		
		System.out.println(conjunto.remove("Teste"));
	    System.out.println(conjunto.remove('x'));
	    
	    System.out.println(conjunto.size());
	    
	    System.out.println(conjunto.contains('x'));// false porquê foi removido
	    System.out.println(conjunto.contains(1));
	    System.out.println(conjunto.contains(true));
	    
	    
	    Set nums = new HashSet();
	    nums.add(1); 
	    nums.add(2); 
	    nums.add(3);
	    
	    System.out.println(nums);
	    System.out.println(conjunto);
	    
	    //conjunto.addAll(nums); // união do conjunto set ao conjunto HashSet, atribuiu o valor
	    // 1, 2 e 3 ao  HashSet conjunto, ou seja, alterou o conteudo de conjunto
	    System.out.println(conjunto);
	    conjunto.retainAll(nums); // mostra os itens em comum, a intercessão entre os dois conjuntos
	    System.out.println(conjunto);
	    
	    conjunto.clear(); // limpa a lista
	    System.out.println(conjunto); // muito desses atributos está presente em outras lista 
	
	}                                        

}
 