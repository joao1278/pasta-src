package fundamentos;

public class tiposprimitivos {
	public static void main(String[] args) {
		// informacoes do fucionario
		
		// tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;  // usar o 'L' no final para saber que é
		//um númeral do tipo long
		
		// tipos numéricos reais 
		// o java analisa o numéro com ponto flutuante, entao
		//temos que colocar o 'F' para ele saber que é do tipo float
		
		float salario = 11_445.44F;  //usar o 'F' no final para o java 
		//saber que é um numéral float e nao um numeral double.
		// porque por padrao ele sera double
		double vendasAcumuladas = 2_991_797_103.01;
		
		boolean estaDeFerias = false; //  outro valor true  // boolean sempre sera 'false' ou 'true'.
		// tipo caracteres
		 char status = 'a'; // ativo  // obs   o tipo caracteres só aceita uma letra.
		 
		 
		// dias de empresa
		 System.out.println(anosDeEmpresa * 365);
		 
		 // numeros de viagens 
		 System.out.println(numerosDeVoos / 2);
		 
		 // pontos por real
		 System.out.println(pontosAcumulados / vendasAcumuladas);
		  
		 System.out.println(id + " ganha -> " + salario);
		 System.out.println("ferias? " + estaDeFerias);
		 
		 System.out.println("status " + status);
		 
		 
		 
		
		
	}

}
