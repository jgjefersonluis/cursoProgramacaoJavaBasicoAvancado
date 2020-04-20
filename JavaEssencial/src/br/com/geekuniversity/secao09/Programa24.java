package br.com.geekuniversity.secao09;
//Construtor

/*
 * O construtor de uma classe SEMPRE tem o mesmo nome da classe;
 * Por padrão, a JVM - Java Virtual Machine, cria em tempo de execução
 * un construtor padrão - um construtor vazio;
 * Podemos ter mais de um construtor na classe;
 */

public class Programa24 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); // Metodo Construtor

		pessoa1.nome = "Felicity Jones";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.ano_nascimento = 1986;

		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("Email: " + pessoa1.email);
		System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento);

		System.out.println();
		
		Pessoa pessoa2 = new Pessoa("Angelina Jolie", "angelinajolie@gmail.com", 1976); // Metodo Construtor
		pessoa2.imprime_informacoes();
		
		/*
		System.out.println("Nome: " + pessoa2.nome);
		System.out.println("Email: " + pessoa2.email);
		System.out.println("Ano de Nascimento: " + pessoa2.ano_nascimento);
*/
	}

}
