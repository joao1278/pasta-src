package controle;

import java.util.Random;
import java.util.Scanner;

public class jogoDaAdivinhação {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	int continuar;
	int numeroSorteado;
	int tentativas;
	int numero;
		
	
		do { 
			System.out.println("acerte o numero entre 0 / 100");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("comecou o jogo \n sera que voce me vence?");
			tentativas = 0;
			
			do {
				tentativas++;
				System.out.printf("tentativas %d:\n" , tentativas );
				numero = entrada.nextInt();
				if (numero > numeroSorteado) {
					System.out.printf("o numero sorteado é menor que %d \n" , numero);
				}else if (numero < numeroSorteado) {
					System.out.printf("numero sorteado é maior que %d \n" , numero);
				}else {
					System.out.printf("parabens voce acertou o "
							+ "numero\n em %d tentativas " , tentativas);
				}
				
			}while (numero != numeroSorteado);
				System.out.println("digite 0 para sair, \nou outro"
						+ " numero para continuar:");
			continuar = entrada.nextInt();
				
			
		}while (continuar != 0);
		
		
			
		entrada.close();
		
	}
	
}
