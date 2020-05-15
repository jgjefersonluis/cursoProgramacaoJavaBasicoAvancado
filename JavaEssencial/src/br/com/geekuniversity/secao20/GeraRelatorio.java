package br.com.geekuniversity.secao20;
/*
 * Para executar metodos em paralelo, nossa classe
 * deve implementar a interface Runnable, e o metodo
 * que precisa ser executado em paralelo deve
 * ser executado dentro do metodo run
 */

public class GeraRelatorio implements Runnable {
	
	public void executa() {
		// For 0 até 10 milhões
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " - Gerando relatório ... aguarde!");
		}

	}

	@Override
	public void run() {
		// For 0 até 10 milhões
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " - Gerando relatório ... aguarde!");
		}

	}

}
