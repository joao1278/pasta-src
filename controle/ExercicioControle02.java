package controle;

import java.util.Scanner;

public class ExercicioControle02 {

	public static void main(String[] args) {
		  
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite o ano: ");
		int ano = entrada.nextInt();
		
		if (ano % 400 == 0) {
			System.out.println(ano +"ano bisexto");
		}else if ((ano % 4 ==0)&& (ano % 100 !=0))
		System.out.println(ano + " ano bisexto");
		else {
			System.out.println("nao é bisexto");
		}
		entrada.close();
	}
}
