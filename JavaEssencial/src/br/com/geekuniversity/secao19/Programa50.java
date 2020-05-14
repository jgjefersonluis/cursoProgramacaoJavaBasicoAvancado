package br.com.geekuniversity.secao19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Mapas são conhecidos como se fossem/representassem 3 coleções
 * Coleção de chaves;
 * Coleção de valores;
 * Coleção de associações;
 */

public class Programa50 {

	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();

		pessoas.put(21, "Felicity Jones");
		pessoas.put(31, "Maria Antonieta");
		pessoas.put(21, "Angelita Jolie");

		// coleções de chaves
		System.out.println("Chaves: " + pessoas.keySet());

		// coleções de valores
		System.out.println("Valores: " + pessoas.values());

		// coleções de associações
		System.out.println("Associação: " + pessoas.entrySet());

		// Iterar na coleção de chaves

		// forma 1
		// Disponibilizado a partir do java 8
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});

		// forma 2
		Set<Integer> chaves = pessoas.keySet();
		for (Integer idade : chaves) {
			System.out.println(pessoas.get(idade));

			// Interar na coleção de valor

			// Forma 1
			Collection<String> valores = pessoas.values();
			for (String nome : valores) {
				System.out.println(nome);
			}
			// Forma 2
			pessoas.values().forEach(nome -> {
				System.out.println(nome);
			});

		}

		// Interar a coleção de associações

		// Forma 1

		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for (Entry<Integer, String> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());

		}

		// Forma 2
		pessoas.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});

	}

}
