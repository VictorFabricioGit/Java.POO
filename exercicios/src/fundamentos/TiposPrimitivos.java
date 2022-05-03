package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do Funcionário
		
		//Tipos numéricos inteiros
		byte anosdeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3123845223L;
		
		//Tipos numéricos reais
		float salario = 11.445_44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo boleano
		boolean estaDeFerias = false; //or true
		//Tipo char
	    char status = 'A'; //Ativo
		
		//Dias de empresa
		System.out.println(anosdeEmpresa * 365 + " Dias de Empresa");
		//Numero de viagens
		System.out.println(numeroDeVoos / 2 + " Viagens");
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas + " pontos por real");
		//Qanto ganha
		System.out.println(id + ": Ganha --> " + salario);
		//está de Ferias?
		System.out.println("Está de Ferias:? " + estaDeFerias);
		//status
		System.out.println("status: " + status);
		
		
	}

}
