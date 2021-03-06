package br.com.geekuniversity.secao15;
// atributos estaticos

/*
 * atributos estaticos sao atributos, onde os valores sao compartilhados
 * entre as instancias da classe.
 * 
 * para utilizar um atributo estatico, colocamos o nome da classe
 * junto ao atributo
 * 
 * Exemplo:
 * 
 * NomeDaClasse.atributo
 * 
 */

public class Programa34 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Angelina Jolie");

		System.out.println(c1.getNumero());
		System.out.println(c1.getCliente());

		Conta c2 = new Conta("Felicity Jones");

		System.out.println(c2.getNumero());
		System.out.println(c2.getCliente());

		Conta c3 = new Conta("Maria da Gra�a");

		System.out.println(c3.getNumero());
		System.out.println(c3.getCliente());

		System.out.println(Conta.contador);

		Conta.contador = 42;

		System.out.println(Conta.contador);
		
		Conta c4 = new Conta("Outro cliente");

		System.out.println(c4.getNumero());
		System.out.println(c4.getCliente());
		
	}

}
