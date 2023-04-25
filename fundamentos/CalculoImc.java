package fundamentos;

import java.util.Scanner;

public class CalculoImc {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("digite sua altura; ");
		double altura = entrada.nextDouble();
		
		
		double resultado = peso / (altura * altura);
		
		
		System.out.printf("%.2f  %.2f = %.2f", peso, altura, resultado);
		
		
		
		
		
		
		
		
		
		
		entrada.close();
		
		
		
		
	}
}
