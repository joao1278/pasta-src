package fundamentos;

public class temperatura {
	
	public static void main(String[] args) {
		//(ºf - 32) * 5/9 = ºc
		final double fator = 5/9.0;
		final double ajuste = 32;
		// ao colocar "final" significa que aquele valor nao ira mudar!
		double ºf = 86;
		//quando tiver parenteses 
		// sempre coloque ele
		//para o resultado esta correto
		double ºc = (ºf - ajuste) * fator;
		// colocando o parentese
		// o java entende que aquela expressao
		// sera feita primeiro
		System.out.println("temperatura = " + ºc);
		
	
		ºf = 0;
		// ao repetir a variavel
		// nao precisa colocar o tipo da variavel 
		// ex: double ou int
		ºc = (ºf - ajuste) * fator;
		System.out.println("temperatura = " + ºc);
		
		
	}

}
