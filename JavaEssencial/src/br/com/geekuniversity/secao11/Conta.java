package br.com.geekuniversity.secao11;

/*
 * Getters e Setters
 * 
 * Getter
 * 		é um método público, que serve para consultar dados;
 * 		A nomenclatura desses métodos é getNome_do_atributo()
 */

public class Conta { // sempre public
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;

	// construtor public
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}

	public void sacar(float valor) {
		if (valor <= (this.saldo)) {
			this.saldo = (this.saldo - valor);
		} else if (valor <= (this.saldo + this.limite)) {
			float val_ret = this.saldo - valor;
			if (val_ret < 0) {
				this.saldo = 0;
			}
			val_ret = this.limite + val_ret;
			this.limite = val_ret;
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public float getSaldo() {
		return this.saldo + this.getLimite();
	}

	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}

	public float getLimite() {
		return limite;
	}

}
