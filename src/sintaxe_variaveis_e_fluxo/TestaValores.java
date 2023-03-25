package sintaxe_variaveis_e_fluxo;

public class TestaValores {
    public static void main(String[] args) {
        int primeiro = 5;
        int segundo = 7;
        segundo = primeiro;

        System.out.println(segundo);
        
        int primeiro1 = 5;
        int segundo2 = 7;
        segundo2 = primeiro1;
        primeiro1 = 10;

        // quanto vale o segundo?

        System.out.println(segundo2);
    		
    }		
}

