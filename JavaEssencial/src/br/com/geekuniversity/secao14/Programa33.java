package br.com.geekuniversity.secao14;
//Interfaces - O que � e quando utilizar

/*
 * Interfaces s�o conhecidas como 'contratos'
 * 
 * Uma empresa criou um contrato 'com regras' para definir
 * a cria��o de um produto/servi�o
 * 
 * quem implementar este contrato � OBRIGADO a seguir as regras.
 * 
 * O Jo�o, decidiu implementar um produto/servi�o baseado neste contrato
 * A Maria, tamb�m decidiu implementar um produto/servi�o baseado no mesmo contrato
 * 
 * Contrato para a confec��o de um bolo
 * o bolo precisa ser de chocolate;
 * o bolo deve ter cobertura;
 * o bolo deve ser recheado;
 * 
 */

public class Programa33 {

	public static void main(String[] args) {

		Ventilador vent = new Ventilador();

		System.out.println("A marca do ventilador � " + vent.MARCA);

		vent.desligar(); // nao deve imprimir a mensagem

		vent.ligar();

		vent.desligar(); // imprimir mensagem

	}

}
