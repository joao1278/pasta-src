package fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("vamos calcular a area do triangulo:");
		
		System.out.print("base: ");
		double base = entrada.nextDouble();
		System.out.print("altura: ");
		double altura = entrada.nextDouble();
		
		System.out.println((base * altura)/ 2);
				
		
		
		
		
		
		entrada.close();
		
		
	}

}
