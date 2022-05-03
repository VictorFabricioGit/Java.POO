package arrays;

public class Usuario {

	String nome;
	String email;

	// object é a classe mãe do java
	public boolean equals(Object objeto) {// eq + Ctrl + espaço para implementar o equals

		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto; // converesão cast explicita

			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual;

		} else {
			return false;
		}

	}

	// o hashcode vai ser abordado em outra aula
	public int hashCode() { // hash + Ctrl + espaço
		return this.nome.length();
		// botão direito + sourse + generate hashcode() para gerar o hashcode
		// padrão do eclipse e também é o mais usado a prova de erro 
	}
}
