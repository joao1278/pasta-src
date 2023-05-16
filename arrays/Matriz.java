package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("qual a quantidade de alunos? ");
		int alunos = entrada.nextInt();
		
		System.out.println("qual a quantidade de notas? ");
		int notas = entrada.nextInt();
		double total = 0;
		//criando a matriz
		double[][] mediaTurma = new double [alunos][notas];
		for (int a = 0; a < mediaTurma.length; a++) {//esse pega o array externo
			// esse pega o array interno¬
			for (int n = 0; n < mediaTurma[a].length; n++) {// desta forma estou 
				//dizendo que a cada aluno "a"	irei percorrer as notas "n"	
				System.out.printf("informe a nota %d do aluno %d ", n +1,a+1);
				// com o "+1" estou somando para que apareca na tela a partir 
				// do numero "1"
				
				mediaTurma[a][n] = entrada.nextDouble();
				total += mediaTurma[a][n];
			}
		}
		double resultado = total / (alunos * notas);//multiplica o valor da nota 
		//pela quantidae de alunos e divide no total.
		System.out.println("a media da turma é: " + resultado);
		
		for(double[] notasdaTurma: mediaTurma) {
		System.out.println(Arrays.toString(notasdaTurma));
		}
		entrada.close();
		
	}
	
	

}
