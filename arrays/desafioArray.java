package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class desafioArray {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("quantas notas sera enviadas? ");
		int nota = entrada.nextInt();
		
		double[] notasAlunoA = new double[nota];
		//criei um Array com a quantidade de notas a ser informada
	
		for (int i = 0; i < notasAlunoA.length; i++) {
			System.out.println("digte a nota: " + (i + 1) + ":");// com o 
			//parentese ele efetua a soma dos numenros
			notasAlunoA[i] = entrada.nextDouble();
		}
		double total = 0;
		for (double soma: notasAlunoA) {// criei um foreach pata percorrer 
			// todos os elementos e somalos juntos.
			total += soma;
		}
		double resultado = (total / notasAlunoA.length);
		System.out.println("a media é: " + resultado);
		System.out.println(Arrays.toString(notasAlunoA));
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
		
	}
	

}
