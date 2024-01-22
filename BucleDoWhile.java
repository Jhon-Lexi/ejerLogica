import java.util.Scanner;
public class BucleDoWhile{
    public static void main(String[] op){
        String t;
        int x=1;
        System.out.println("proprociona un texto \n");
        Scanner leeDato = new Scanner(System.in);
        t=leeDato.nextLine();
        System.out.println("\n");
        do {
            System.out.println(t);
            x++;
        } while (x<=10);
    }
}