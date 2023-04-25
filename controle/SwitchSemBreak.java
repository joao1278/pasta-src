package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		// if (bool)
		//while(bool)
		//for(;bool;)
		
		// apos o "case"
		//por apenas dois pontos (:)
		String faixa = "preta";
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("sei o bassai");
		case "marrom":
			System.out.println("sei o tekki shodam");
		case "roxa":
			System.out.println("sei o godam");
		case "verde":
			System.out.println("sei o yodam");
		case "laranja":
			System.out.println("sei o sadam");
		case "vermelha":
			System.out.println("sei o nidam");
			break;//apos o break por (;)
			default:
			System.out.println("nao sei de nada");
		
		}
		
		System.out.println("fim");
		
		int idade = 3;
		
		switch (idade) {
		case 3:
			System.out.println("sabe programar");
		case 2: 
			System.out.println("sabe falar");
		case 1 : 
			System.out.println("sabe olhar");
			
		}
		
		
	}

}
