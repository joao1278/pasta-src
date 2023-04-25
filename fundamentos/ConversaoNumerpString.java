package fundamentos;

public class ConversaoNumerpString {

	
	public static void main(String[] args) {
		 
		Integer num1 = 10000;
		// quando voce coloca ".toString"
		// o numeral se torna uma string
		// e voce pode mechelo
		
		System.out.println("quantidade de letras ".toUpperCase() +
				num1.toString().length());
		
		//para converter um tipo primitivo em string
		//temos que chamar o tipo
		//ex: "integer.toString(A,B ou C)
		
		int num2 = 100000;
		System.out.println("qual sua idade \n" +
		Integer.toString(num2).length());
		
		// dessa forma tbem o java entendi
		// que voce esta aoterando
		//um numero para String
		System.out.println("" + num2);
		System.out.println("" + num1);
		
		
	}
}
