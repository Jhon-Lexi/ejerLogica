import java.util.Scanner;
public class BucleWhile{
    public static void main(String[] jk){
        int x=0, k=1,r=0;
        System.out.println("da un numero a evaluar");
        Scanner leeDato= new Scanner(System.in);
        x=leeDato.nextInt();

        while(k<=20){
            r=x*k;
            System.out.println(r);
            k++;
        }
    }
    
}