package classe;

public class DesafioConstrutor {
	
	int dia;
	int mes;
	int ano;
	
	DesafioConstrutor(int diaInicial, int mesInicial, int anoInicial) {
		
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
		
	}
		
    DesafioConstrutor(){ // construtor padrão
    	dia = 1;
    	mes = 1;
    	ano = 1970;
    	
    }
	
    String obterDataFormatada() {
    	return String.format("%d/%d/%d", dia, mes, ano); // retorna o valor 
    	//real direto para o metedo d2 e para o valor d1
    }
	
}
