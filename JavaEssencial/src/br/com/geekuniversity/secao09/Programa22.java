package br.com.geekuniversity.secao09;
// Objetos

/*
 * Objeto são produtos/instancias da classe
 */

public class Programa22 {

	public static void main(String[] args) {
		int numero = 4;

		// declaração e instanciação/iniciação do objeto
		Produto p1 = new Produto(); //construtor
		// p1 -> instancia do objeto/objeto
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;

		System.out.println("==========PRODUTOS==========");
		System.out.println("#### " + p1.nome + " ####");
		System.out.println("R$ " + p1.preco);
		System.out.println(p1.desconto + "%");

		Produto p0 = new Produto(); //cosntrutor
		p0.nome = "Caneta Bic";
		p0.preco = 2.45f;
		p0.desconto = 5;

		System.out.println("==========PRODUTOS==========");
		System.out.println("#### " + p0.nome + " ####");
		System.out.println("R$ " + p0.preco);
		System.out.println(p0.desconto + "%");

		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Angelina Jolie";
		pessoa1.email = "jolie@gmail.com";
		pessoa1.ano_nascimento = 1976;

		System.out.println("==========PESSOAS==========");
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("Email: " + pessoa1.email);
		System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento);

	}

}
