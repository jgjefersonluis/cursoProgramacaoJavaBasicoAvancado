package br.com.geekuniversity.secao12;

//Herança

/*
 * beneficio:
 * evita a repetiçao de código
 * facilita a manutenção do programa
 */

public class Programa28 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Pedro da Silva", 1987, "pedro@gmail.com");

		System.out.println(p1);
		
		System.out.println();

		Aluno a1 = new Aluno("Vanessa da Silva", 2001, "vanessa@gmail.com", "123456");

		System.out.println(a1);
		
		System.out.println();

		Professor prof1 = new Professor("Augusto da Silva", 1976, "augusto@gmail.com", "ABC9B7");

		System.out.println(prof1);

	}

}
