package controle;

import java.util.Scanner;

public class ExercicioControle03 {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.print("digite a primeira nota: ");
		Double nota01 = entrada.nextDouble();
		if (nota01 > 10 || nota01 < 0) {
			System.out.println("nota invalida.");}
		
		System.out.println();
		
		System.out.print("digite a segunda nota: ");
		Double nota02 = entrada.nextDouble();
		if (nota02 > 10 || nota02 < 0) {
			System.out.println("nota invalida.");}
	
		
		Double  media = ((nota01 + nota02) /2);
		
		
	    if (media >= 7 && media <= 10) 
		{
		System.out.println("aprovado!");}
		
		else if (media <= 6.9 && media>= 4){
		System.out.println("recuperação!");}
	    
		else 
			System.out.println("reprovado!");
		
		
			
		
			System.out.println("media do aluno(a): " + media);
		
		
		
		
		entrada.close();
		
	}
	

}
