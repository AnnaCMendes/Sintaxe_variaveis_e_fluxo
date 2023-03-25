package sintaxe_variaveis_e_fluxo;


// tabuada organizada

public class LacosEncadeados2 {
	public static void main(String[] args) {
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int contador = 0; contador <= 10; contador++) {
				//aqui tem tabuada de 1 à 10
				System.out.print(multiplicador * contador);
				//aqui você deixa espaço vazio
				System.out.print(" ");
			}
			// so que para cada vez que ele multiplicar e fizer tabuada de 1,2,3..
			// realize o System.out.println();, fora do laço para que esteja organizado.
			System.out.println();
		}
	}
}
