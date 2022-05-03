package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		
    this(1, 1, 1970); //this() serve para chamar um construtor dentro do outro, ou seja
	}// chamar this como um novo método
	
	String dataFormatada() {
		return String.format("%d/%d/%d", this.ano, mes, ano);//this.atributo serve para
	}// separar o mebro de instâcia do mebro de classe para não dar conflito de sintaxe
    
	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d", dia, mes, ano); // void significa vazio, ou seja
	// não precisa de return
	}
	Data(int dia, int mes, int ano){
		this.dia = dia; // serve para referenciar o objeto, serve para resolver conflito de nomes
		this.mes = mes;
		this.ano = ano;
	}

}
