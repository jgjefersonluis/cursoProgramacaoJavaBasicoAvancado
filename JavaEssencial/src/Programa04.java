
public class Programa04 {

	public static void main(String[] args) {
		// Declarando e incializando a variavel
		int numero = 5;

		/*
		 * se (numero > 5 ent�o { escreva("Sim, o numero" + numero + "� maior que 5"); }
		 * sen�o se { escreva("N�o, o numero" + numero + " � igual a 5"); } } sen�o {
		 * escreva("N�o, o numero" + numero + " n�o � maior que 5"); }
		 */

		if (numero > 5) {
			System.out.println("Sim, o numero " + numero + " � maior que 5.");
		} else if (numero == 5) {
			System.out.println("N�o, o numero " + numero + " � igual a 5.");
			// Verifica se o numero � par
		} else if (numero % 2 == 0) {
			System.out.println(" O numero " + numero + " � par.");
		} else {
			System.out.println("N�o, o numero " + numero + " n�o � maior que 5.");

		}

	}

}
