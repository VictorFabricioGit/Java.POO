package classe;

public class ValorVSReferencia {
	
	public static void main(String[] args) {
		
		
		double a = 2;
		double b = a; // atribuição por valor (Tipo Primitivo)
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data d1 = new Data();
		Data d2 = d1; // Atribuição por referência (Objeto)
		
		d1.dia = 2;
		d2.mes = 6;
		d2.ano = 2010;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		voltarParaValorPadrao(d1);  // d1 e d2 compartilhao o mesmo endereço na memória, ou seja, quando um valor
		                           //  de ambos é alterado o outro também é alterado mas a prática não é interessante
		System.out.println(d1.dataFormatada());// pois pode gerar conflito, não é visto como uma boa prática de progamação
		System.out.println(d2.dataFormatada());
	    
		int c = 5;
		alterarPrimitivo(c); // Nos tipos primitivos é feito um clone e o valor não é alterado 
		System.out.println(c);// diferente do objeto onde é compartilhado um mesmo endereço na memória
	
	}
	
	static void voltarParaValorPadrao(Data d) {
		d.dia = 29;
		d.mes = 12;
		d.ano = 1991;
	}
	
	static void alterarPrimitivo (int a) { 
		a++;
	}
	

}
