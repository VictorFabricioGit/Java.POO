package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	 
	final String nome;
	final List<Curso> cursos =  new ArrayList<Curso>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
		
	}
	
	Curso ObterCursoPorNome(String nome) {		
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}
	
    public String toString() {
		return nome; //hellow
	}
	

}
