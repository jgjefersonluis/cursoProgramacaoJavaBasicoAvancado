package br.com.geekuniversity.secao04;
// Instru��o Switch
public class Programa06 {

	public static void main(String[] args) {
		int numero = 3;

		switch (numero) {
		case 1:
			System.out.println("O numero � 1");
			break;
		case 3:
			System.out.println("O numero � 3");
			break;
		case 5:
			System.out.println("O numero � 5");
			break;
		default:
			System.out.println("O numero � " + numero);
			break;
		}

	}

}
