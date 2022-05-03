package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal.".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s);
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salário = 12345.987;
		
		String maisUmafrase = "Nome: " + nome + "\nSobrenome: " + sobrenome
				+ "\nidade: " + idade + "\nSalário: " + salário +"\n\n";
		
		System.out.println(maisUmafrase);
		
		// String de formatção com "printf"
        System.out.printf("O senhor %s %s tem %d anos e ganha %.2f",
        		nome, sobrenome, idade, salário );	
        // Outra maneira de concatenar com "String.format"
        String frase = String.format("\nO senhor %s %s tem %d anos e ganha %.2f",
        		nome, sobrenome, idade, salário);
        System.out.println(frase);
        
       // %s = String / %d = int / %f float / %.2f coloca duas casas apos a virgula.        
                                                          	    
	    
	    
	    
		
	}   

}
