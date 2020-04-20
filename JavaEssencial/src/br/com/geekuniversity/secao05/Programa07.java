package br.com.geekuniversity.secao05;
import java.util.Scanner;

/*
 * Receba dados do usuario enquanto a idade for maior que 0.
 */

// while e do while
public class Programa07 {

	public static void main(String[] args) {

		int idade = 0;
		String nome;

		// Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);

		// Sempre checa o valor anter de executar o bloco
		while (idade > 0) {

			System.out.println("Informe o seu nome: ");
			nome = teclado.nextLine();

			System.out.println("Informe a sua idade: ");
			// idade = teclado.nextInt(); // BUG
			idade = Integer.parseInt(teclado.nextLine());

			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos.");
			}
		}

		teclado.close();
	}

}
