package br.com.geekuniversity.secao04;
//Operador ternario

// Se voc� precisar criar a fun��o main() // programa java
// main e no teclado pressionar CTRL + barra de espa�o
public class Programa05 {

	public static void main(String[] args) {
		int valor = 3, numero;

		/*
		 * if(valor > 0){ numero = valor; } else{ numero = 7; }
		 */

		// Operador Ternario
		numero = (valor > 0) ? valor : 7;

		System.out.println(numero);

	}

}
