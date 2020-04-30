package br.com.geekuniversity.secao15;
// Metodos estáticos

/*
 * Um metodo estatico, nao depende de uma instancia da classe
 * para ser utilizado
 * 
 * pode-se utilizar conforme:
 * 
 * NomeDaClasse.metodo();
 */

public class Programa35 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Meu cliente");

		System.out.println("Numero da conta: " + c1.getNumero());
		System.out.println("Cliente: " + c1.getCliente());
		
		System.out.println("A proxima conta sera: " + Conta.proximaConta());

	}

}
