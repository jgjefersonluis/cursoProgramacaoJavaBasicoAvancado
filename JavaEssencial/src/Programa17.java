// Vetores parte 2
public class Programa17 {

	public static void main(String[] args) {
		// Declarando e defini��o de tamanho do vetor
		int numeros[] = new int[10];

		System.out.println("Tamanho do vetor: " + numeros.length);

		for (int i = 0; i < numeros.length; i++) {
			// numeros[0] = i+3;
			numeros[1] = i + 3;
			// numeros[9] = i+3;

		}

		System.out.println(numeros[0]); // primeiro elemento
		System.out.println(numeros[9]); // ultimo elemento

		// 0..9
		// numeros[10] = 42;
		// System.out.println(numeros[10]);
		/*
		 * Os vetores/arrays possuem tamanho fixo e n�o podem sere aumentados/diminuidos
		 */

		numeros[0] = 7;
		System.out.println(numeros[0]);// primeiro elemento

		// numeros[0] = 23.4f;
		/*
		 * Os vetores/arrays possuem tipos de dados fixos e n�o aceitam tipos variados.
		 */
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i] = (int)Math.round(Math.random()*10);
		}
		
		System.out.println(numeros[0]); // primeiro elemento
		System.out.println(numeros[9]); // ultimo elemento
		
		//0..1 double
		System.out.println(Math.random());
		System.out.println(Math.random()*10);
		System.out.println(Math.round(Math.random()*10));
		
		for(int i : numeros) {
			System.out.println(i);
		}

	}

}
