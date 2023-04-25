package arrays;



public class Foreach {
	
	public static void main(String[] args) {
		
		double[] notas = {5.2,8.5,6.4,3.5};
	    for (int i = 0; i < notas.length; i++) {
	    	System.out.println(notas[i]);
			
		}
	     
	    System.out.println();
	    double total = 0 ;
	    for (double nota : notas) {
	    	total += notas.length;
			System.out.println(total / nota);
			
		}
	    
	}
	

}
