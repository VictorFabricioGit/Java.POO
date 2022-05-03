package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();// Queue e LinkedList usa o método de lista
		
		// Adiciona elementos na fila a Diferença é o comportamento
		fila.add("Ana");
		fila.offer("Bia"); // Retorna falso se a lista está cheia e tem um valor determinado
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); // apresenta o proximo elemento da fila
		System.out.println(fila.peek()); // se a fila estiver vazia retorna como null
		System.out.println(fila.element()); // apresenta o primeiro elemento da fila
		System.out.println(fila.element()); // se a fila estiver vazia retorna um erro
		
		//fila.size(); tamanho da fila
		//fila.clear(); limpa a fila
		//fila.isEmpty(); saber se a fila está vazia
		//fila.contains(); saber se um objeto está ou não contido na fila
		
		System.out.println(fila.poll()); // remove o proximo elemento da lista até acabar
	    System.out.println(fila.poll()); // quando acaba retorna o valor null diferente de
	    System.out.println(fila.remove());// remove que quando a fila está vazia retorna um erro
          	
	
	}  

}
