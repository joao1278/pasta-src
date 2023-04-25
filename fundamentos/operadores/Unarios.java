package fundamentos.operadores;

public class Unarios {
	
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		
		a++;  // a = a +1;
		a--;  // a = a -1;
		//forma pos fixada
		
		++b;  // b = b + 1;
		--b;  // b = b - 1;
		// forma pre fixada
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("mine desafio".toUpperCase());
		System.out.println(++a == b--); // quando colocamos o sinal apos a variavel
		// ele primeiro conpara para depois acrescentar ou retirar o valor
		System.out.println(++a == --b);
		
		
		
		
		
		
		
		
		
	}

}
