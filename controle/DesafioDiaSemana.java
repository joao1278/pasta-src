package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// quando for usar o scanner na variavel
		// coloque o ".next"
	
		
		System.out.print("dia da semana: ");
		String dia = entrada.next();
		// como eu vou digitar somente uma palavra
		// o next é suficiente
		// porem se fosse digitar mas de uma palavra
		//teria que usar o nextline
		
		if (dia.equalsIgnoreCase("domingo"))
		{	System.out.println("01");}
		// para conparar uma string
		// ultilize o (.equalsIgnoreCase)
		
		else if (dia.equalsIgnoreCase("segunda"))
		{	System.out.println("02");}
		
		else if (dia.equalsIgnoreCase("terça")
				//colocando a logica "ou"
				// para poder digitar de outras formas e nao 
				// dar erro no programa
				|| dia.equalsIgnoreCase("terca"))
		{System.out.println("03");}
		
		else if (dia.equalsIgnoreCase("quarta"))
		{	System.out.println("04");}
		
		else if (dia.equalsIgnoreCase("quinta"))
			{System.out.println("05");}
		
		else if (dia.equalsIgnoreCase("sexta"))
			{System.out.println("06");}
		
		else if (dia.equalsIgnoreCase("sabado")
				||dia.equalsIgnoreCase("sábado") )
			System.out.println("07");
		else {
			System.out.println("dia invalido");
		}
		
		
		
		entrada.close();
		
		
	}

}
