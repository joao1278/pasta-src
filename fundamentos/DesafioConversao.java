package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
     public static void main(String[] args) {
    	 
    	 Locale.setDefault(new Locale("en" , "US"));
    	 
    	 
    	 
    	 Scanner entrada = new Scanner(System.in);
    	 // obs
    	 // ao utilizar (.replace)
    	 // eu digo para o java
    	 // substituir a "," por "." ponto
    	 //sendo isso uma string 
    	 System.out.print("digite seu salario 01 ");
    	 String salario1 = entrada.nextLine().replace(",",".");
    	 
    	 System.out.print("digite seu salario 02 ");
    	 String salario2 = entrada.nextLine().replace(",",".");
    	 
    	 System.out.print("digite seu salario 03 ");
    	 String salario3 = entrada.nextLine().replace(",",".");
    	 
    	 //replace..  substitui o primeiro valor
    	 // pelo segundo valor
    	 
    	 double valor01 = Double.parseDouble(salario1);
    	 double valor02 = Double.parseDouble(salario2);
    	 double valor03 = Double.parseDouble(salario3);
    	  double soma = valor01+valor02+valor03;
    	  
    	 
    	 System.out.println("media de salario " + soma /3);
    	 entrada.close();
    	 
    	 
    	 
	
}
	
	
	
}
