package fundamentos.operadores;

public class Logicos {
	
	
	public static void main(String[] args) {
		
		
		         boolean condicao1 = true;
				 boolean condicao2 = 3 > 7;
				 
				 System.out.println(condicao1 && condicao2);
				 System.out.println(condicao1 || condicao2);
				 System.out.println(condicao1 ^ condicao2);
				 System.out.println(!condicao1);
				 System.out.println(!!condicao1);
				 System.out.println(!condicao2);
				

				 System.out.println("\n tabela verdade E (AND)");
				 System.out.println(true && true);//true
				 System.out.println(true && false);//false
				 //System.out.println(false && true);//false
				 //System.out.println(false && false);//false
				 
				 System.out.println("\n tabela verdade OU (OR)");
				// System.out.println(true || true);//true
				// System.out.println(true || false);//true
				 System.out.println(false || true);//true
				 System.out.println(false || false);//false
				 
				 
				 System.out.println("\n tabela verdade OU Exclusivo (XOR)");
				 System.out.println(true ^ true);//false
				 System.out.println(true ^ false);//true
				 System.out.println(false ^ true);//true
				 System.out.println(false ^ false);//false
				 
				 System.out.println("\n tabela verdade NOT");
				 System.out.println(!true);
				 System.out.println(!false);
				 				 
				 
				 
				 
				 
				
				 
				 
				 
				 
				 
				 
	}
	

}
