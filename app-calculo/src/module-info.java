module app.calculo {
	
	requires transitive app.logging;
	exports br.com.victor.app.calculo;
	
	exports br.com.victor.app.calculo.interno
		to app.financeiro, app.logging;
	
	opens br.com.victor.app.calculo to app.financeiro;
	
	requires app.api;
}