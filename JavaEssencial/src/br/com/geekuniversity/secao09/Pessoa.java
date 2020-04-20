package br.com.geekuniversity.secao09;
//Atributo

//M�todos

//Construtores

/*
 * sempre, um construtor vazio tem a seguinte forma:
 * 
 * public NomeDaClasse(){
 * 
 * }
 * 
 */
public class Pessoa {
	String nome, email;
	int ano_nascimento;

	// construtor vazio
	public Pessoa() {

	}

	// construtor com parametros
	public Pessoa(String nome, String email, int ano_nascimento) {

		// this == Este objeto
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}

	void imprime_informacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("Ano de Nascimento: " + this.ano_nascimento);

	}

}
