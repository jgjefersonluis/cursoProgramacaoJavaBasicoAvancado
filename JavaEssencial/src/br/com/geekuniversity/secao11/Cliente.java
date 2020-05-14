package br.com.geekuniversity.secao11;
//Protected (Protegido)

// é o modificador de acesso default (padrão)

/*
 * o modificador de acesso Protected faz com que
 * o elemento seja visivel somente dentro do mesmo
 * pacote onde o elemento foi declarado
 */

public class Cliente implements Comparable {
	private int idade;
	private String nome;
	private String endereco;

	public Cliente(int idade, String nome, String endereco) {
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;

		this.dizer_oi();
	}

	protected void dizer_oi() {
		System.out.println(this.nome + " está dizendo oi!");
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	@Override
	public String toString() {
		return this.nome;
	}

	@Override
	public int compareTo(Object outro) {
		Cliente aux = (Cliente) outro;
		if (this.idade < aux.idade) {
			return -1;
		} else if (this.idade > aux.idade) {
			return 1;
		} else {
			return 0;
		}

	}
}
