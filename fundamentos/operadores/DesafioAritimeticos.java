package fundamentos.operadores;

public class DesafioAritimeticos {
	
	public static void main(String[] args) {
		
		int a = 3 * 4 - 10;
		// como essa metodo ira trazer um resultado (double)
				// para termos um resultado inteiro
				// damos um cast (int) para o resultado vim inteiro
		int b = (int)Math.pow(a, 3);
		//para elevarmos essa variavel a alguma potencia
		// usamos ( Math.pow) para fazer essa elevação
		
		
		
		double c = Math.pow(a, 3);
		
		
		
		System.out.println(b);
		System.out.println(c);
		
		 a = 3 + 2;
		 b = 6 * a;
		 c = Math.pow(b, 2);
		double d = 3 * 2;
		double e = c / d;
		System.out.println(e);
		
		var f = 2 - 7;
		var g = 1 - 5;
		var h = g * f;
		
		var i = h / 2;
		var j = Math.pow(i, 2);
		System.out.println(j);
		
		var l = e - j;
		var m = Math.pow(l, 3);
		var n = Math.pow(10, 3);
		var o =(int) m / n ;
		System.out.println("esse é o resultado " +(int) o);
		
		// resultado e outra possibilidade de resposta
		double numA = Math.pow(6 * ( 3 + 2), 2);
		double denA = 3 * 2;
		 
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
			
			System.out.println("O Resultado é " + resultado);
			
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
