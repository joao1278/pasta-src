package fundamentos.operadores;

public class OperadorTernario {
	
	
	public static void main(String[] args) {
		
		
		double media = 8.6;
		String resutadoRecuperaçao = media >= 5.0 ? "em recuperação" : "reprovado";
		
		// o calculo final sera feito na string "resultado"
		// sendo que a variavel "resultadoRecuperação" tera dois valores
		// atribuidos
		String resultado = media >= 7.0 ? "aprovado" : resutadoRecuperaçao;
		
		System.out.println("o aluno esta " + resultado );
		
		double nota = media;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >=7;
		
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado01 = temDesconto ? "sim" : "não";
		
		System.out.println("tem desconto " + resultado01);
		
		
		
	}
	
	

}
