package br.com.victor.app.calculo;

import br.com.victor.app.Calculadora;
import br.com.victor.app.calculo.interno.OperacoesAritimeticas;
import br.com.victor.app.logging.Logger;

public class CalculadoraImpl {
	
	private OperacoesAritimeticas opAritimeticas = new OperacoesAritimeticas();

	public double soma(double... nums) {
		Logger.info("somando...");
		return opAritimeticas.soma(nums);
	}
	
	
	

}
