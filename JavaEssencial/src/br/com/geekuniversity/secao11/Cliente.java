package br.com.geekuniversity.secao11;
//Protected (Protegido)

// � o modificador de acesso default (padr�o)

/*
 * o modificador de acesso Protected faz com que
 * o elemento seja visivel somente dentro do mesmo
 * pacote onde o elemento foi declarado
 */

public class Cliente {
	private String nome;
	private String endereco;

	public Cliente(String nome, String endereco) {

		this.nome = nome;
		this.endereco = endereco;

		this.dizer_oi();
	}

	protected void dizer_oi() {
		System.out.println(this.nome + " est� dizendo oi!");
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

}
