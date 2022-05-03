package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Victor";
		compra1.adicionarItem(new Item("Caneta preta", 2, 2.0)); // usando o modo bidirecional
		compra1.itens.add(new Item("Borracha", 3, 2.75));
		compra1.itens.add(new Item("Caderno", 3, 2.75));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.valorTotal());
		
		
		
	}

}
