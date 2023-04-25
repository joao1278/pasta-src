package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		
		String valor1 = JOptionPane.showInputDialog("Digite o promeiro número");
	
	String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
	// nesse caso ele nao ira somar
	// ele ira concatenar
	// pois ele esta lendo duas string
	System.out.println(valor1 + valor2);
	
	
	// nesse exenplo estamos 
	// mudando string para numeral
	// nesse caso double
	double numero1 = Double.parseDouble(valor1);
	double numero2 = Double.parseDouble(valor2);
	
	double soma = numero1 + numero2;
	
	System.out.println(" Soma " + soma);
	System.out.println("sua media " + soma / 2);
	
	
	
	
	
	}
}
