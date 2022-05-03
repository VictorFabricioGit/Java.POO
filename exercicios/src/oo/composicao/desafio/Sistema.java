package oo.composicao.desafio;

public class Sistema {
	
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 1997.88), 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem("caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 900.00), 1);
		
		Cliente cliente = new Cliente("Maria de jesus");
		cliente.compras.add(compra1);		
        cliente.adicionarCompra(compra2);	
		
		System.out.println(cliente.obterValortotal());
	}

}
