package br.com.geekuniversity.secao06;
//Tipos booleanos
public class Programa14 {

	public static void main(String[] args) {
		// tipos primitivos
		boolean verdadeiro = true;
		boolean falso = false;

		// tipos nao primitivos
		Boolean v = true;
		Boolean f = false;

		boolean ativo = true; // boolean ativo = false;

		System.out.println("Verdadeiro" + verdadeiro);
		System.out.println("Falso" + falso);
		System.out.println("V" + v);
		System.out.println("F" + f);

		if (verdadeiro) {
			System.out.println("� Verdadeiro");
		} else {
			System.out.println("� Falso");
		}

		if (1 == 3) {
			System.out.println("1 == 1 � Verdadeiro");
		} else {
			System.out.println("... � falso");
		}

		if (ativo) {
			System.out.println("Pode acessar o sistema.");
		} else {
			System.out.println("Acesso negado!");
		}

	}

}

/*
 * if(realiza uma verifica��o que no final retorna ou true ou false
 */
