package fundamentos.operadores;

public class Aritimeticos {
	
	public static void main(String[] args) {
		
		System.out.println(2+3);
		// posso colocar o valor a ser processado ditero
		
		
		var x = 34.56;
		double y = 2.2;
		// tbem posso colocar os valores dentro de cada
		//modulo e colocar o resultado em uma variavel
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		// nesse modo podemos fazer alteracoes na variavel
		// podendo mexer no objeto
		
		int a = 8;
		int b = 3;
		
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		//desse modo podemos fazer o resultado inteiro 
		// ficar fracionado
		// é um cast
		System.out.println(a / (double)b);
		System.out.println(a / (float)b);
		
		// operador de modulo
		// mostra o resto da divisao
		
		// o operador modulo usa (%) para ser o seu simbolo
		System.out.println(8 % 3);
		System.out.println(a % b );
		
		System.out.println(x + y - a * b);
		
		
		
		
		
		
	}

}
