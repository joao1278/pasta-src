package colecoes;

import java.util.Set;
import java.util.TreeSet;

public class conjuntoComportado {
	public static void main(String[] args) {
		//organizar import (ctrl +  shift + o)
		
		
		//Set<String> lista = new HashSet<String>();// esse nao segue uma orden de 
		// colocação
		
		Set<String> lista = new TreeSet<>();// esse organiza em ordem alfabetica 
		
//		Set<String> lista = new HashSet<String>();
		//desta fofma estou dizendo que a coleção sera de string
		lista.add("Joao");
		lista.add("Pedro");
		lista.add("Carlos");
		lista.add("Luana");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new TreeSet<>(); 
		nums.add(1);
		nums.add(5);
		nums.add(153);
		nums.add(147);
		
		for(int n : nums){
		System.out.println(n);}
		
	}

}
