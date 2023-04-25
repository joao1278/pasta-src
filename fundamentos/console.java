package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		
		
		
		System.out.print("bom");
		// usando so o system.out.print o comando ira ficar
		// na mesma linha
		System.out.print(" dia\n");
		// apos o comando voce fazer outro comando com "println" 
		//ele ira gerar uma nova linha 
		//porem esse primeiro comando ira ficar na mesma linha anerior ao 
		// comando
		System.out.println("bom");
		System.out.println("dia".toUpperCase());
		
		//printf /formatado 
		//os caracteres do texto formatado sao substituidos pelos numeros que vc 
		// coloca
		//sendo ele da mesma quantidade
		System.out.printf("mega sena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);
		// como esse comando nao muda de linha
		// tem que colocar "%n" para ter a quebra de linha
		
		// essa substituicao é com numeros e ponto flutuante
		System.out.printf("salário: %.1f %n", 1234.5678);
		
		// o sinbulo "%s" é para substituir por um tipo string
		System.out.printf("nome: %s %n", "joão\n\n");
		
		// system.in ira escaniar oque eu digitar no teclado
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.",nome, sobrenome, idade);
		
		entrada.close();
		
		
	}
		
	}


