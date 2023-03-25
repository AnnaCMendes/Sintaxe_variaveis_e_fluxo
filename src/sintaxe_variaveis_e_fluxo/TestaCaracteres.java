package sintaxe_variaveis_e_fluxo;

public class TestaCaracteres {

	public static void main(String[] args) {
        char letra = 'a';
        System.out.println(letra);
        
        // como se trata de um único carctere, este mesmo será a letra B
        char valor = 66;
        System.out.println(valor);
        
        
        
        // soma a letra, no caso acima B + 1 = C
        valor = (char) (valor + 1);
        System.out.println(valor);
        
        
        //string utiliza quantos caracteres quiser
        String palavra = "alura cursos online de tecnologia";
        System.out.println(palavra);

        
        // faz união da frase acima e adiciona o valor 2020 (concatenação)
        palavra = palavra + 2020;
        System.out.println(palavra);
	}

}
