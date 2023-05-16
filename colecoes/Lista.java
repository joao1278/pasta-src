package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		//nao esquecer de colocar o nome do Array
		ArrayList<Usuario> lista = new ArrayList<>();
		//aqui eu criei um usuario e add ele na lista
		Usuario u1 = new Usuario("ana");
		lista.add(u1);
		
// aqui eu criei um objeto e ja coloquei na lista		
		lista.add(new Usuario ("Luana de jesus"));
		lista.add(new Usuario ("Joao kevin"));
		lista.add(new Usuario ("Luan de jesus"));
		
		for (Usuario u : lista) {
			System.out.println(u.nome);
		}
		System.out.println(lista.get(2));
		// nesse metodo estou mostrando o nome que esta no indece 02
		// junto com o metodo ToString
		System.out.println(lista.remove(3));
		System.out.println(lista.contains(new Usuario("Joao kevin")));
	}

}
