package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno Principe"); // retorna false se a pilha estiver cheia
		livros.push("Dom Quixote");// retorna erro caso a pilha esteja cheia
	    livros.push("O Hobbit");
	    
	    System.out.println(livros.peek());// como a lógica e diferente o ultimo a entrar
// é o primeiro a sair o livro apresentado vai ser O Hobbit
	    System.out.println(livros.element());// a mesma lógica serve para .element
	    
	    for(String livro: livros) {  // mostra do ultimo até o primeiro
	    	System.out.println(livro);
	    }
	    
	    
	    System.out.println(livros.pop());// outra maneira além do pool para excluir
	    System.out.println(livros.poll());
	    System.out.println(livros.poll());
	    System.out.println(livros.poll());
	    System.out.println(livros.poll());
	    System.out.println(livros.pop());// assim como remove da erro quando a pilha acaba
	
//	    livros.size();
//	    livros.contains(); também têm os mesmo atributos de lista
//	    livros.clear();
//	    livros.isEmpty();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}   

}
