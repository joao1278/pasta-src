package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String ("2");
		
		System.out.println("2" == s1);
		
		System.out.println("2" .equals(s1)); // o equals vai calcular os conteudos
		// do objeto 
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();// o next retira os espaços em branso
		// ja o nextline nao retira
		// fica da mesma forma que foi digitado      
		System.out.println("2" == s2.trim());// trim retira os espaços em branco
		
		System.out.println("2".equals(s2.trim()));// use equals para 
		//conparar as string
		
		
		
		entrada.close();
		
		
		
	}

}
