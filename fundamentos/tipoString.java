package fundamentos;

public class tipoString {
	
	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(1));// com o ".cherAt " podemos 
		// usar a letra da palavra.
		
		String s = "boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s.concat("??"));
		System.out.println(s+("!!"));
		System.out.println(s.concat("!!"));
		//nesse caso deu verdadeiro 
		// porque eu pos pra nao considerar maiuscula ou menuscula
	System.out.println(s.toLowerCase().startsWith("boa"));// comeca com?
	System.out.println(s.startsWith("boa"));
//	System.out.println(s.toUpperCase().endsWith("TARDE"));//termina com?
	System.out.println(s.length());// essa função mostra quantos caracteres 
	// exixte na variavel
	System.out.println(s.equals("boa tarde"));//comparaçao 
	System.out.println(s.equalsIgnoreCase("boa tarde"));//comparaçao com
	//iguinoração da forma da letra
	

	var nome = "joao";
	var sobrenome = "mauricio";
	var idade = 33;
	var salario = 123456.987;
	// essa forma é concatenado...  pode ficar grande o codigo
	System.out.println("nome: " + nome + "\nsobrenome: " + sobrenome + "\nidade: " + idade +
			"\nrecebe: " + salario);
	//dessa forma substituimos para deixar o codigo menor
	System.out.printf("\n\no senhor %s %s tem %d\ne recebe %.2f de salario"
			// obs %s = string  %d = inteiros e %f = numero com ponto flutuante
			,nome,sobrenome,idade,salario);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
				
	
	}

}
