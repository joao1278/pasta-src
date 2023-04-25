package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		
		double a = 1;  // conversao inplicita
		// porque sair do valor INT para double 
		// e double armazena INT sem perder dados
		
		// obs double armazena ponto flutuante
		System.out.println(a);
		
		
		//
		float b = (float)1.12345; // coversao explicita (CAST)
		// pode haver perda de valores
		System.out.println(b);
		
		int c = 340;
		// explicita (CAST)
		byte d = (byte) c; // pode dar erro e perda de valores
		// pois o byte so armazena ate 127
		System.out.println(d);
		
		
		// ultilize mais o "INT" e o "DOUBLE" pois nao 
		//sofrera tanto com perdaas e erros
		// no seu codigo
		
		
		
		
		
		
	}

}
