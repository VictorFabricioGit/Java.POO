package fundamentos;

public class DesafioOperadoresAritimeticos {

	public static void main(String[] args) {
		//Primeira parte
		double numA = Math.pow(6 * (3+2), 2);
		double denA = 3 * 2;
		double superiorA = numA / denA;
		System.out.println(superiorA);
		//segunda parte
		double numB = ( 1 - 5 ) * ( 2 - 7 );
		double denB = 2;
		double superiorB = (Math.pow(numB / denB, 2));
		System.out.println(superiorB);
		//Terceira parte
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		System.out.println(superior / inferior);
		
				
	}

}
