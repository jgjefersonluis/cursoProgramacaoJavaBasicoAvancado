
public class Programa04 {

	public static void main(String[] args) {
		// Declarando e incializando a variavel
		int numero = 5;

		/*
		 * se (numero > 5 então { escreva("Sim, o numero" + numero + "é maior que 5"); }
		 * senão se { escreva("Não, o numero" + numero + " é igual a 5"); } } senão {
		 * escreva("Não, o numero" + numero + " não é maior que 5"); }
		 */

		if (numero > 5) {
			System.out.println("Sim, o numero " + numero + " é maior que 5.");
		} else if (numero == 5) {
			System.out.println("Não, o numero " + numero + " é igual a 5.");
			// Verifica se o numero é par
		} else if (numero % 2 == 0) {
			System.out.println(" O numero " + numero + " é par.");
		} else {
			System.out.println("Não, o numero " + numero + " não é maior que 5.");

		}

	}

}
