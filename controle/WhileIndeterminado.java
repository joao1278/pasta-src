package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		String valor = "";
		// ja que eu quero que ele execulte
		//snpre que o valor que for digitado seja diferente de "sair"
		//damos uma negação antes da centença 
	//colocando uma exclamação antes do (equals)
		while (!valor.equalsIgnoreCase("sair"))
			//enqunato "valor" nao for igual a sair. contunua a execução
			//while = enquanto
			{System.out.print("voçê diz: ");
		//temos que atribuir a entrada na variavel valor
		//para nao gerar um laço infinito
		// assim que a variavel valor for igual a "sair"
		// o programa ira parar
		valor = entrada.nextLine();}
		//OBS.....
		// NAO ESQUECA DO POR A CHAVE{} NO CODIGO
		
		
		entrada.close();
		
		
		
	}
}
