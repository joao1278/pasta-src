package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("digite a nota: ");
		// gerei uma string e logo apos
		// fiz ela se torna um double em outra
		// variavel
		String nota01 = entrada.nextLine().replace(",", ".");

		double nota = Double.parseDouble(nota01);

		if (nota > 10 || nota < 0) {
			System.out.println("nota invalida.");
		}

		else if (nota >= 8.1) {
			System.out.println("conceito A");
			System.out.println("parabéns");
		} else if (nota >= 7.1) {
			System.out.println("conceito B");
		} else if (nota >= 5.1) {
			System.out.println("conceito C");
		} else if (nota >= 3.1) {
			System.out.println("conceito D");
		} else if (nota >= 2.1) {
			System.out.println("conceito E");
		} else {
			System.out.println("conceito F");
		}

		System.out.println("fim.");

		entrada.close();

	}

}
