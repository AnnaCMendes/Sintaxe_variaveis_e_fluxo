package sintaxe_variaveis_e_fluxo;

//Tabuada só que com os números em sequencia sem espaços

public class LacosEncadeados {

	public static void main(String[] args) {
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for (int contador = 0; contador <= 10; contador++) {
				System.out.println(multiplicador * contador);
			}
		}
	}
}