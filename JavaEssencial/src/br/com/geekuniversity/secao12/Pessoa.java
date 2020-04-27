package br.com.geekuniversity.secao12;
/* 
 * classe base
 * classe mae
 * classe pai
 * super classe
 * classe generica
 * 
 */

// agora como classe abstrata
/*
 * Desta forma, impossibilitamos a criação de objetos desta classe
 * 
 * Uma classe abstrata pode ter: 
 * atributos;
 * metodos;
 * metodos abstratos
 * São metodos, que nao possuem implementaçao, possuem apenas
 * declaração e obrigatoriedade, as classes que herdarem desta 
 * classe com metodos abstrato, precisa implementar estes metodos.
 */

public abstract class Pessoa {
	private String nome;
	private int ano_nascimento;
	private String email;

	public Pessoa() { // sobrecarga de metodo = overloading

	}

	public Pessoa(String nome, int ano_nascimento, String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno_nascimento() {
		return ano_nascimento;
	}

	public void setAno_nascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// overriding -> sobrescrita de metodo
	public String toString() {
		return "Nome: " + this.nome + "\nAno Nascimento: " + this.ano_nascimento;
	}

	public void mensagem() {
		System.out.println("Esta é a minha mensagem...");
	}

	public void mensagem(String msg) {
		System.out.println(msg);
	}
	
	public void mensagem(String msg, int num) {
		System.out.println(msg + num);
	}
	
	// declaração de um metodo abstrato
	public abstract void outra_mensagem(String texto) ;

}
