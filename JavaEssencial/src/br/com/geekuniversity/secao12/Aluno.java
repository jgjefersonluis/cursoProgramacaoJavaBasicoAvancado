package br.com.geekuniversity.secao12;
//Herança

/*
* beneficio:
* evita a repetiçao de código
* facilita a manutenção do programa
* ..........................
* 
* classe especifica
* sub-classe
* classe filha
* 
* ...........................
* 
* Aluno é um Pessoa
* 
* Quando uma classe herda de outra classe ela ganha
* todos os atributos e metodos da classe herdada.
*/

public  class Aluno extends Pessoa {

	private String ra;

	public Aluno(String nome, int ano_nascimento, String email, String ra) {
		super(nome, ano_nascimento, email);
		this.ra = ra;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	// overriding -> sobrescrita de metodo
	public String toString() {
		return super.toString() + "\nRegistro do aluno:  " + this.ra;
	}

	// overriding -> sobrescrita de metodo
	public String getNome() {
		return "Aluno: \n" + super.getNome();
	}

	@Override
	public void outra_mensagem(String texto) {
		System.out.println(texto);
	}

}
