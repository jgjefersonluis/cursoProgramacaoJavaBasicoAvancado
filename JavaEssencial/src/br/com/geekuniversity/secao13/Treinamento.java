package br.com.geekuniversity.secao13;

// template method

/*
 * Final � um modificador de acesso que faz com que
 * o elemento que esteja utilizado, n�o possa ser extendido/reescrito.
 * 
 */

public abstract class Treinamento {

	// template method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();

	}

	private void treinoTatico() {
		System.out.println("Treino t�tico...");
	}

	private void jogoTreino() {

	}

	private void preparoFisico() {
		

	}

}
