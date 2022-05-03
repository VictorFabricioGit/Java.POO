package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// ( F - 32 ) * 5/9 = C
		
		double firerith = 100;
		final double const1 = 32;
		final double const2 = 5/9.0;
		
		System.out.println( "C = " + ( firerith - const1) * const2);
		//OU double celcios = ( firerith - const1) * const2)
		//System.out.println(celcios)
	}

}
