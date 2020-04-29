package br.com.geekuniversity.secao14;
/*
 * Uma interface pode conter:
 * - constantes
 * - metodos abstratos;
 * 
 * Interface para servir de contrato para produtos eletronicos. Todo
 * produto eletronico que implementar esta interface OBRIGATORIAMENTE
 * deverao implementar os metodos abstratos.
 * 
 */

public interface IEletronico {

	public String MARCA = "Geek";

	public void ligar();

	public void desligar();
}
