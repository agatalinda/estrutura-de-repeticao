import java.util.Random;
public class EstruturaDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do{
            //excutando repetidas vezes até alguém atenter
            System.out.println("Telefone tocando...");
        }while(tocando());

        System.out.println("Alô!!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1; 
        System.out.println("Alguém atendeu? " + atendeu);
        return !atendeu;
    }
}
