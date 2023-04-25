package fundamentos.operadores;

public class DesafioLogicos {
	
	
	public static void main(String[] args) {
		
		
		        boolean trabalho1 = false;
				boolean trabalho2 = true;
				
				
				boolean  and = trabalho1 && trabalho2;
				boolean ou = trabalho1 || trabalho2;
				boolean xor = trabalho1 ^ trabalho2;
				
				System.out.println("tv de 50\" = " + and ) ;
				System.out.println("tomar sorvete = " + ou );
				
				System.out.println("tv de 32\" = " + xor );
				
				// operador unário
				boolean MaisSaudavel = !ou;
				System.out.println("mais saudavel? " + MaisSaudavel);
				
				
		
		
		
	}

}
