package br.com.geekuniversity.secao21;

import java.util.Arrays;

public class Vetor {

	private Aluno alunos[] = new Aluno[100];
	private int total = 0;

	public void adiciona(Aluno aluno) {
		this.garantirEspaco();
		this.alunos[total] = aluno;
		total = total + 1;

		/*
		 * for (int i = 0; i < alunos.length; i++) { if (alunos[i] == null) { alunos[i]
		 * = aluno; break; } }
		 */

	}

	public void adiciona(int posicao, Aluno aluno) {
		this.garantirEspaco();
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o inv�lida!");
		}

		for (int i = total - 1; i >= posicao; i -= 1) {
			alunos[i + 1] = alunos[i];
		}
		alunos[posicao] = aluno;
		total++; // total = total + 1
	}

	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		return this.alunos[posicao];
	}

	public void remove(int posicao) {
		for (int i = posicao; i < this.total; i++) {
			this.alunos[i] = this.alunos[i + 1];

		}

	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < total; i++) {
			if (aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		// TODO devolve a quantidade de alunos no vetor
		return 0;
	}

	@Override
	public String toString() {
		return Arrays.toString(this.alunos); // facilita a visualiza��o do array

	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < total;
	}

	private void garantirEspaco() {
		// Verifica se o array alunos est� cheio
		if (total == alunos.length) {
			// Caso esteja cheio, cria um novo array com o dobro de tamanho do array
			// anterior
			Aluno novoArray[] = new Aluno[alunos.length * 2];
			// Copia os dados do array anterior para o novo array
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			// por ultimo atribuimos o novo array ao array original
			this.alunos = novoArray;
		}
	}

}
