package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("informe média: ");
		String media = entrada.nextLine().replace(",", ".");
		double media01 = Double.parseDouble(media);

		// tudo quem vem apos o (if) sera execultado
		// apos a condição associada
		if (media01 <= 10 && media01 >= 7.0) {
			System.out.println("aprovado!");
			System.out.println("parabéns!");
		}
		// no java vc tem fechar um bloco com
		// chaves para ele saber que o (if)
		// se aplicara aquele bloco de codigos
		if (media01 >= 5.5 && media01 <= 6.9)

		{
			System.out.print("em recuperação: ");
			System.out.println("vamos estudar mais!!");
		}

		if (media01 <= 5.4 && media01 >= 0) {
			System.out.println("reprovado: ");
		}

		entrada.close();

	}

}
