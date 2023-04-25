package controle;

import java.util.Scanner;

public class DesafioWhile {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	int quantidadesDeNotas = 0;
	double nota = 0;
	double total = 0;
	
	
	while(nota != -1) {//em quanto a nota for diferente de -1 vai execultando o 
		//codigo
		System.out.print("informe a nota (ou -1 para sair): ");
		nota = entrada.nextDouble();//usuario digita a nota
		
		if (nota <= 10 && nota >=0) {
			total += nota; //atribuicao adtiva//nesse cenario apenas concideraçao
			quantidadesDeNotas++;                      // de notas validas
			//incremento em cima da quantidade de notas
		} else if (nota!=-1) {
			System.out.println("nota invalida!!!  ;D");
		}
		
	}
		// calcular
	double media = total / quantidadesDeNotas;
	System.out.println("media = "+ media);
	
	
		entrada.close();
	}
}
