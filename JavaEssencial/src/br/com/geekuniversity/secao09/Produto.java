package br.com.geekuniversity.secao09;
// Classes
/*
 * O nome das classes inicia com letra maiuscula;
 * O nome n�o deve conter: Acentua��o, caracteres especiais, espa�o
 * Nas classes Java, n�o existe a implementa��o da fun��o main()
 * Toda classe Java possui a seguinte forma:
 * O nome da classe Java deve ser o memo nome do arquivo.java
 * 
 * public class NomeDaClasse{
 * 
 * }
 */

//Atibutos
/*
 * S�o as caracteristicas da classe/molde/modelo de dados
 * Podemos entender atributos como variaveis da classe;
 * Uma outra forma de nomenclatura para os atributos s�o estados;
 * Atributos s�o nomeados em letras min�sculas, sem espa�os, sem
 * caracteres especiais, sem acentua��o
 */

//Metodos
/*
 * Podemos entender os metodos como a a��o que � reallizada por um objeto da classe;
 * Podemos entender tambem que os metodos sao comportamento dos objetos da classe;
 * Mesmo requisitos para fun��es
 * uma fun�ao deve ter o seguinte a)tipo de retorno b)nome = corresponde a a��o
 * que a fun��o realiza c) parametro/argumento de entrada (opcional)
 *  d)retorno (Opcional - depende do tipo de retorno)
 */

public class Produto {
	String nome;
	float preco;
	float desconto;

	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}

}
