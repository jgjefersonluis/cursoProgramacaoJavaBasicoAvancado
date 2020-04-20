package br.com.geekuniversity.secao05;
import java.util.Scanner;

// for
public class Programa09 {

	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);

		// variavel de controle; condição de parada; forma de incremento
		// 1++ -> i = i + 1

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o seu nome: ");
			nome = teclado.nextLine();

			System.out.println("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());

			if (idade > 0) {
				System.out.println(nome + "tem" + idade + " anos");
			}
		}
		teclado.close();

	}

}
