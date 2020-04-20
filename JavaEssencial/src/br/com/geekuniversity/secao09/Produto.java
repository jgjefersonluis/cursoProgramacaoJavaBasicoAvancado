package br.com.geekuniversity.secao09;
// Classes
/*
 * O nome das classes inicia com letra maiuscula;
 * O nome não deve conter: Acentuação, caracteres especiais, espaço
 * Nas classes Java, não existe a implementação da função main()
 * Toda classe Java possui a seguinte forma:
 * O nome da classe Java deve ser o memo nome do arquivo.java
 * 
 * public class NomeDaClasse{
 * 
 * }
 */

//Atibutos
/*
 * São as caracteristicas da classe/molde/modelo de dados
 * Podemos entender atributos como variaveis da classe;
 * Uma outra forma de nomenclatura para os atributos são estados;
 * Atributos são nomeados em letras minúsculas, sem espaços, sem
 * caracteres especiais, sem acentuação
 */

//Metodos
/*
 * Podemos entender os metodos como a ação que é reallizada por um objeto da classe;
 * Podemos entender tambem que os metodos sao comportamento dos objetos da classe;
 * Mesmo requisitos para funções
 * uma funçao deve ter o seguinte a)tipo de retorno b)nome = corresponde a ação
 * que a função realiza c) parametro/argumento de entrada (opcional)
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
