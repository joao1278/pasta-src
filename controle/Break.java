package controle;

public class Break {
	
	public static void main(String[] args) {
		
		for (int i = 0; i <10; i++) {
			
			if (i == 5) {// quando (i) for igual a (5) ele vai parar o codigo
				break;
			}
			System.out.println(i);
			
			
		}
		System.out.println("Fim!".toUpperCase());
	}

}
