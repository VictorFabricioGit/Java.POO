package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	
	public Ferrari() {
		super(300);

	}
	@Override // @Override indica que o método "acelerar" contido na classe "Carro" foi sobrescrito em "Ferrari"
	void acelerar() {
		velocidadeAtual += 15;
		
		
    
		
	}

}
