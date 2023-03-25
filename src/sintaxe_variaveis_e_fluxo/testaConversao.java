package sintaxe_variaveis_e_fluxo;

public class testaConversao {
	public static void main (String[] args) {
        double salario = 1270.50;
        // podemos realizar o comando confirmando ao Java, 
        //que realmente queremos realizar a conversão de inteiro para double.
        int valor = (int) salario;
        System.out.println(valor);
        
        
        //numeros maiores que 2bilhoes
        long numeroGrande = 28256151156L;
        System.out.println(numeroGrande);
        // valores com no máximo 4 casas decimais
        short valorPequeno = 2578;
        System.out.println(valorPequeno);
        // utiliza valor apenas até o 127
        byte b = 127;
        System.out.println(b);
        
        
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1+valor2;
        System.out.println(total);
        
        // Neste caso, usa-se o casting, o que seria estranho, ou se indica que este 
        //literal, o valor 3.14, é um float, colocando-se "f" no fim:
        
        float pontoFlutuante = 3.14f;
        System.out.println(pontoFlutuante);
        
	}
}
