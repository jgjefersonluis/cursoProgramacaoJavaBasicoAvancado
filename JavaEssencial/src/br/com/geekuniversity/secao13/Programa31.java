package br.com.geekuniversity.secao13;

import br.com.geekuniversity.secao12.Aluno;
import br.com.geekuniversity.secao12.Pessoa;

// classes abstratas

/*
 * � um recurso que proporciona um bloqueio na cria��o de objetos
 * n�o conseguimos instanciar objetos de uma classe abstrata;
 */

public class Programa31 {

	public static void main(String[] args) {

		Aluno maria = new Aluno("Maria da Silva", 1999, "maria@gmail.com", "123456");

		System.out.println(maria);

		maria.outra_mensagem("Meu nome �: " + maria.getNome());

	}

}
