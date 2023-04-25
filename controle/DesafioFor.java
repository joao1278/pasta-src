package controle;

public class DesafioFor {

	
	
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 10;
	
		String valor = "#";
		for (int i = a; i<= b; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//versao do desafio
		// nao pode usar valor numerico
		//para controlar o laço
		
		//resposta
		
		              //enquato v for diferente
		for(String v = "#";!v.equals("######"); v+="#") {
			System.out.println(v);
		}
	}
}
