package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	// para tirar as advertencia ctrl + 1
	// aparece essa notacao a baixo 
	//obs "main" no final
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		// criei o comnjuto
		
		// adicionando produto a minha colecão
		// ele converte automatico
		conjunto.add(1.2); // double / Double
		conjunto.add(true);// boolean / Boolean
		conjunto.add("teste");// String
		conjunto.add(1);// int / Integer
		conjunto.add(1);// int / Integer
		conjunto.add('x');//caracteres / Char
		conjunto.add('#');//caracteres / Char
		
		
		System.out.println(conjunto);
		//para saber o tamanho do conjunto
		System.out.println("o tamanho da coleção é: " + conjunto.size());
		
		//para remover do conjunto
		// dessa forma ele ira retorna verdadeiro ou falso
		System.out.println(conjunto.remove("teste"));//removel
		System.out.println(conjunto.remove(12));//não removel
		
		// o tamanho da colecao mudou
		System.out.println("o tamanho da coleção é: " + conjunto.size());
		
		//esse metodo mostra se tem ou nao esse elemento 
		// no conjunto
		// resultado boolean
		System.out.println(conjunto.contains(1));// contem
		System.out.println(conjunto.contains("teste"));// nao contem
		
		// um novo conceito a ser abordado
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		// para unir os conjuntos
		System.out.println(nums);
		System.out.println(conjunto);
		
		//*conjunto.addAll(nums);// adicionei nums a coleção conjuto
		
		//para interceção: mostra apenas oque tem em comunm nos conjuntos
		conjunto.retainAll(nums);
		
		System.out.println(conjunto);
		
		//System.out.println(conjunto.size());
		//para linpar o conjunto
        conjunto.clear();
        System.out.println(conjunto);
		
	}
	
	

}
