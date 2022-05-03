package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item){
		itens.add(item);
		item.compra = this;
	}
	
	double valorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.quatidade * item.preco;
		}
		
		
		return total;
	}
	

}
