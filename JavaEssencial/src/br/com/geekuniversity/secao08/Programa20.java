package br.com.geekuniversity.secao08;
import java.util.Scanner;

//Criando nossas proprias funçoes

/*
 * Faça um programa que receba diversos nomes
 * de frutas do usuario e no final imprima essas
 * frutas em ordem contraria. O programa deve 
 * solicitar ao usuario quantas frutas ele
 * informar
 * 
 *  Informe o nome de uma fruta:
 *  manga
 *  
 *  Informe o nome de uma fruta:
 *  Goiaba
 *  
 *  Goiaba
 *  Manga
 */

public class Programa20 {
	// declarando o vetor
	// variavel global
	static String frutas[];
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		//variavel local
		int qtd;

		System.out.println("Informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());

		cadastrar_dados(qtd);
		
		mostrar_dados(qtd);

		teclado.close();
	}

	/*
	 * uma funçao deve ter o seguinte a)tipo de retorno b)nome = corresponde a ação
	 * que a função realiza c) parametro/argumento de entrada (opcional) d)retorno
	 * (Opcional - depende do tipo de retorno)
	 * 
	 * void=vazio
	 */

	static void cadastrar_dados(int quantidade) {

		// definindo o tamanho do vetor
		frutas = new String[quantidade];

		for (int i = 0; i < quantidade; i++) {

			System.out.println("Informe a " + (i + 1) + " fruta:");
			frutas[i] = teclado.nextLine();

		}

	}

	static void mostrar_dados(int quantidade) {
		for (int i = (quantidade - 1); i >= 0; i--) {
			System.out.println(frutas[i]);
		}
	}
}
