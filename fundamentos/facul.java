package fundamentos;

import java.util.Scanner;

public class facul {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o ano atual: ");
		int anoAtual = entrada.nextInt();
		
		System.out.println("digite ano nascimento: ");
	int anoNasc = entrada.nextInt();
	
	int idade = anoAtual - anoNasc;
		System.out.println("sua idade é " + idade + " anos" );
		
		
		
		
		entrada.close();
		
	}

}
