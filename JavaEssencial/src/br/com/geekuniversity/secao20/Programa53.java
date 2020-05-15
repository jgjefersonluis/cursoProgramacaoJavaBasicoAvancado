package br.com.geekuniversity.secao20;
//Thread Não Sincronizada (Não é estavel)

/*
 * O sincronismo ocorre pois durante a execução do metodo a thread
 * executa um 'lock' (bloqueio) da função para que outra thread
 * so possa executa-la pos a finalização da thread inicial.
 */

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

/*
 * Por padrao as threads nao sao sincronizadas. Pode ocorrer problemas
 * de uma thread acessar o valor de um objeto que ainda nao foi atualizado
 * ou ainda as threads executarem depois do valor ja estar impresso.
 */

public class Programa53 {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1); // saldo 500

		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);

		t1.start(); // 500 + 100 -> 600?
		t2.start(); // 600 + 100 -> 700?

		System.out.println(c1);

	}

}
