package arrays;

import java.util.Arrays;

public class exercicioforeach {
	public static void main(String[] args) {
		
		
		double[] NotasAlunoA = new double[3];
		
		NotasAlunoA[0] = 7.9;
		NotasAlunoA[1] = 5.3;
		NotasAlunoA[2] = 8.5;
		System.out.println(Arrays.toString(NotasAlunoA));
		//desta forma posso inprimir todo o array
		//usando esse metodo (Arrays.toString)
		
		
		
		//arrays + ctrl e espaco 
		// vou colocar o array de java.util que é uma classe
		//dentro dela tem uma função toString
		
		//criando um laço para calcular o array completo
		
		double total = 0 ;
		for (double nota : NotasAlunoA){//usei um atributo do objeto
			//NotasAlunoA (.length)para percorrer todo o array 
			total += nota;
			
		}
		
		
		System.out.println(total / NotasAlunoA.length);//desta forma vai dividir pela
		//quantidade de numeros que esta no array+
		System.out.println(NotasAlunoA[1]);// assin estou inprimindo cada 
		System.out.println(NotasAlunoA[2]);// valoe do array
		
		
		}

	}



