package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
		// classes primitivas
		// as classes primitivas e os outros
		// são os objetos que podem ser mexidos 
		//ou auterados
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		// execulta o valor do byte que esta na classe
		
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f =123.10F;
		//temos que colocar o 'f' no final
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		
		//convertendo uma string para boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		// para mudar um boolean para string 
		//fazemos o exemplo a baixo
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';  //char
		// com isso podemos converter ele para uma string
		// dessa forma
		System.out.println(c.toString());
		//isso nao inpede de voçê concatenar o caracteres
		// com uma string
		System.out.println(c + "joao");
		
		
		
	}

}
