
public class Programa15 {

	public static void main(String[] args) {
		int num1 = 5, num2 = 9, res;
		float res2;

		// soma
		res = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " � " + res);
		;

		// subtra��o
		res = num1 - num2;
		System.out.println("A subtra��o de " + num1 + " - " + num2 + " � " + res);
		;

		// multiplica��o
		res = num1 * num2;
		System.out.println("A multiplica��o de " + num1 + " * " + num2 + " � " + res);
		;

		// divis�o (inteira)
		res = num2 / num1;
		System.out.println("A divis�o de " + num2 + " / " + num1 + " � " + res);

		// divis�o (real)
		res2 = (float) num2 / (float) num1; // cast
		System.out.println("A divis�o de " + num2 + " / " + num1 + " � " + res2);
		// modulo
		/*
		 * Se o resto do modulo da variavel por 2 for 0, a variavel � par. Se o resto
		 * for 1, a variavel � impar
		 */
		res = num1 % 2;
		System.out.println("O resto da divis�o de " + num1 + "por 2 � " + res);

		res = num2 % 3;
		System.out.println(num2 + "� divisivel por 3? " + res);

	}

}
