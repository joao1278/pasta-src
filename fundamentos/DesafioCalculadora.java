package fundamentos;

import java.util.Scanner;



public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("informe o valor: ");
		
		double num1 = entrada.nextDouble();
		
		
		System.out.print("informe a operação: ");
		String op = entrada.next();
		
		
		System.out.print("informe valor: ");
		double num2 = entrada.nextDouble();
		
		// logica
		
		double resultado = "+".equals(op)? num1 + num2 : 0;
		// se mais for igual a variavel operador
		// seguinifica que ele ira pegar o valor de num1 + num2 e operar
		// caso contrario ira informar zero
		
		       resultado = "-".equals(op)? num1 - num2 : resultado;
		       resultado = "/".equals(op)? num1 / num2 : resultado;
		       resultado = "*".equals(op)? num1 * num2 : resultado;

		System.out.printf("%.2f %s %.2f = %.2f" , num1, op, num2, resultado);
		
		
		
		
		
		entrada.close();
	}

}
