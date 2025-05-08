
import java.util.concurrent.ThreadLocalRandom;
public class EstruturaWhile {
    public static void main(String[] args) { 
        double mesada = 50.0; 
        while(mesada >0){
            Double valorDoce = valorAleatorio();
            if (valorDoce> mesada)
            valorDoce = mesada; //mesada = mesada - valorDoce; //mesada -= valorDoce; //mesada = mesada - valorDoce;

            System.out.println("Você comprou um doce de R$" + valorDoce +"Adicionado no carrinho'" + mesada);
            mesada = mesada - valorDoce; //mesada -= valorDoce; //mesada = mesada - valorDoce;
        }

        System.out.println("Mesada:" +mesada);
        System.out.println("Leandro gastou toda a sua mesada em doces!");

        }
        private static double valorAleatorio() {
            return ThreadLocalRandom.current().nextDouble(2,8); 
    }
}