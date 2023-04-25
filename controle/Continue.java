package controle;

public class Continue {

	
	public static void main(String[] args) {
		
		for (int i = 0; i <10; i++) {
			if (i % 2 == 1) {//isso quer dizer que o valor sera inpar
				continue;    // o continue enterrope apenas aquela iteração
			}                // e vai para a proxima
			System.out.println(i);
		}
		// o continue enterronpe aquela repetição
		// e continua na proxima expreção
		
		for (int i = 0; i <=10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
