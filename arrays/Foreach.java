package arrays;



public class Foreach {
	
	public static void main(String[] args) {
		
		double[] notas = {5.2,8.5,6.4,3.5};
	    for (int i = 0; i < notas.length; i++) {
	    	System.out.print(notas[i]);
			
		}
	     
	    System.out.println();
	  //criando o foreach
	    for (double nota : notas) {
	    	
			System.out.println(nota);
			
		}
	    
	}
	

}
