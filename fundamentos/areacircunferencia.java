package fundamentos;

public class areacircunferencia {			
	
	public static void main(String[] args) {
		double raio = 3.4;
		//para tornar uma variavel constante
		//colocamos final antes de double
		final double PI = 3.14159;
		// posso criar outra variavel com o nome area
		// e colocar double para criar
		// coloco o resultado da equacao como 
		// resultado da area
		double area = PI*raio*raio;
		
		System.out.println(area);
		
		raio = 15;
		area = PI * raio * raio;
		System.out.println("Area = " + area + "m2");
	}

}
