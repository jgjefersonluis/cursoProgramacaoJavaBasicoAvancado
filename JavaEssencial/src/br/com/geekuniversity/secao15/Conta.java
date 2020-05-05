package br.com.geekuniversity.secao15;

public class Conta {

	public int numero;
	public String cliente;

	public static int contador = 1;

	public Conta(String cliente) {

		this.numero = contador;
		this.cliente = cliente;
		Conta.contador = Conta.contador + 1;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Conta.contador = contador;
	}

	public static int proximaConta() {
		return Conta.contador;
	}

}
