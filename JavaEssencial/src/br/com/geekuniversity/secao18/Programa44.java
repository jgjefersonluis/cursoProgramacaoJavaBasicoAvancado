package br.com.geekuniversity.secao18;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
// escrita em arquivos 2
public class Programa44 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		try {

			PrintStream escrever = new PrintStream(new FileOutputStream("saida2.txt"), true);

			for (int i = 0; i < 5; i++) {
				System.out.println("Escreva algo: ");
				String msg = teclado.nextLine();
				escrever.println(msg);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possivel criar o arquivo.");
		}
		teclado.close();
	}

}
