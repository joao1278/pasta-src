package controle;

import java.util.Scanner;

public class ExercicioControle {

	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite um numero valido: ");
		int numero = entrada.nextInt();
		
		if (numero >= 0 && numero <=10) {
		
		
		
		
		if (numero % 2 ==0) {
			System.out.println( "numero: " + numero +" numero par");
		}
			else
			{System.out.println("numero: " + numero +" inpar");
		}
		}else {System.out.println("numero invalido");}
			
		
		
		
		
		
		entrada.close();
		
	}
}
