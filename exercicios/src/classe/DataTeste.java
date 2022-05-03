package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 29;
		d1.mes = 12;
		d1.ano = 1991;
		
		System.out.printf("%d/%d/%d\n\n" 
				, d1.dia, d1.mes, d1.ano);
		
		var d2 = new Data();
		d2.dia = 14;
		d2.mes = 6;
		d2.ano = 2021;
		
		System.out.printf("meu amor nasceu em: %d/%d/%d\n\n"
				, d2.dia, d2.mes, d2.ano);
		
		var d3 = new Data();
		d3.dia = 29;
		d3.mes = 12;
		d3.ano = 1991;
		
		
		System.out.println(d3.dataFormatada());
		
		// o metodo abaixo so funciona em terminal, ou seja, não funciona em aplicação web
		// nem dekstop, também não funciona em aplicação mobile. o metodo return.String.format
        // é o ideal para aplicações responsivas
		
		
		// outra maneira de imprimir a data diretamente formatada
		d3.imprimirDataFormatada(); //"()" um metodo chmando outro dentro de Data
		
		
	}

}
