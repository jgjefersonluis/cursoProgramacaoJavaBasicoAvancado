package br.com.geekuniversity.secao05;
import java.util.Scanner;

/*
 * Receba dados do usuario enquanto a idade for maior que 0.
 */

// do while
public class Programa08 {

	public static void main(String[] args) {

		int idade = 0;
		String nome;

		// Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);

		// primeiro executa o bloco e depois faz a checagem
		do {

			System.out.println("Informe o seu nome: ");
			nome = teclado.nextLine();

			System.out.println("Informe a sua idade: ");
			// idade = teclado.nextInt(); // BUG
			idade = Integer.parseInt(teclado.nextLine());

			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos.");
			}
		} while (idade > 0);

		teclado.close();
	}

}
