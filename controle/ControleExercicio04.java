package controle;


import java.util.Scanner;

public class ControleExercicio04 {
	
	public static void main(String[] args) {
		
		int contadorDeDivisores = 0;
		
		Scanner entrada = new Scanner(System.in);
		String primo = "";
		System.out.println("digite um numero: ");
		int numero = entrada.nextInt();
		
		for (int i = 2; i <numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		switch (contadorDeDivisores) {
		case 0 :
			primo = "numero primo: ";
			break;
		default:
				primo = "numero nao primo: ";
		}
		System.out.println(primo + numero);
		entrada.close();
		
		
	}

}
