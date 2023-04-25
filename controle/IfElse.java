package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("informe o número:");

		int numero = Integer.parseInt(valor);
		// transformei uma strig em numero inteiro
		// usando o "Interger. no caso de numero inteiro

		if (numero % 2 == 0) {
			System.out.println("numero par:");
		} else {
			System.out.println("numero inpar:");
		}

		// outra maneira
		// if (numero % 2 == 1)
		// System.out.println("numero inpar");

	}

}
