package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Arrays (Vetores/Matrizes)
 * 
 * Um array tem tamanho fixo, um array com 5 elementos
 * ele terá sempre no máximio 5 elementos.
 * 
 * Um array tem tipo de dado fixo. um array de inteiros so poder
 * ter inteiros
 * 
 * É dificil encontrar um determinado elemento em um array. Precisamos
 * para isso varrer todo o array atraves do seu indice caso nao façamos
 * busca pelo indice.
 * 
 * Colections (Coleções)
 * 
 * Java possui diversas classes/interfaces que facilitam muito o trabalho quando
 * se trata de coleções de dados. Essas classes/interfaces são chamadas de Collections
 * 
 * Listas
 * 
 * Aceitam repetiçao de valores
 * Possuem tamanho infinito (Depende da memoria)
 * Podemos adicionar valores de qualquer tipo,
 * desde que não especifacamos um tipo na declaração
 * 
 */

public class Programa45 {

	public static void main(String[] args) {
		// ArrayList nomes = new ArrayList(); // sem definir tipo de dado podemos
		// colocar qualquer tipo
		ArrayList<String> nomes = new ArrayList<String>(); // Definimos o tipo String

		nomes.add("Maria");
		nomes.add("Felicity");
		nomes.add("Angelina");
		nomes.add("Geek");
		nomes.add("maria");
		nomes.add("Angelina");

		/*
		 * nomes.add(44); nomes.add(true); nomes.add(12.4); nomes.add("e");
		 * 
		 * 
		 * System.out.println(nomes.get(0)); System.out.println(nomes.get(3));
		 * 
		 * System.out.println(nomes.size());
		 * 
		 * for (int i = 0; i < nomes.size(); i++) { System.out.println(nomes.get(i)); }
		 */

		Collections.sort(nomes); //ordena 

		for (String nome : nomes) {
			System.out.println(nome);
		}

	}

}
