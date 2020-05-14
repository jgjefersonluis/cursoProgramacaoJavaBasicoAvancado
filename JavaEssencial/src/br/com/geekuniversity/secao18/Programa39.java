package br.com.geekuniversity.secao18;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

//Object: A m�e de todas as classes

/*
* A classe Object, faz parte do pacote java.lang
*/

public class Programa39 {

	public static void main(String[] args) {

		Cliente cli1 = new Cliente(18, "Angelina Jolie", "Rua 1, 234");
		Cliente cli2 = new Cliente(45, "Felicity Jones", "Rua 2, 432");

		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(1, 200, 300, cli2);

		Caixa prateleira = new Caixa();

		System.out.println(c1);// por padr�o a instancia imprime com toString()
		System.out.println(c2);

		if (c1.equals(c2)) {
			System.out.println("S�o a mesma conta");
		} else {
			System.out.println("S�o contas diferentes");
		}
		prateleira.adicionar(c1);// 0 -> tem getSaldo();
		prateleira.adicionar(c2);// 1-> tem getSaldo();

		// Conta conta = prateleira.pegar(0);

		System.out.println(((Conta) prateleira.pegar(0)).getSaldo());

		prateleira.adicionar(cli1);// 2 -> n�o getSaldo();

		System.out.println(((Cliente) prateleira.pegar(2)).getNome());// cast

		if ((Object) cli1 instanceof Conta) {
			System.out.println("O objeto � do tipo Conta");
		} else {
			System.out.println("O objeto n�o � do tipo Conta");
		}
	}

}
