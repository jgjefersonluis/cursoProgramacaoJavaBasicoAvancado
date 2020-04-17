
public class Programa15 {

	public static void main(String[] args) {
		int num1 = 5, num2 = 9, res;
		float res2;

		// soma
		res = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " é " + res);
		;

		// subtração
		res = num1 - num2;
		System.out.println("A subtração de " + num1 + " - " + num2 + " é " + res);
		;

		// multiplicação
		res = num1 * num2;
		System.out.println("A multiplicação de " + num1 + " * " + num2 + " é " + res);
		;

		// divisão (inteira)
		res = num2 / num1;
		System.out.println("A divisão de " + num2 + " / " + num1 + " é " + res);

		// divisão (real)
		res2 = (float) num2 / (float) num1; // cast
		System.out.println("A divisão de " + num2 + " / " + num1 + " é " + res2);
		// modulo
		/*
		 * Se o resto do modulo da variavel por 2 for 0, a variavel é par. Se o resto
		 * for 1, a variavel é impar
		 */
		res = num1 % 2;
		System.out.println("O resto da divisão de " + num1 + "por 2 é " + res);

		res = num2 % 3;
		System.out.println(num2 + "é divisivel por 3? " + res);

	}

}
