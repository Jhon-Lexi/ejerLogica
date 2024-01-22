import java.util.Scanner;
public class PruebasDeEjercicios {

    public static void main(String[] chale) {
        long x=0,numfac=0;
        for (long i = 3; i<600851475143; i++) {
            if (numfac%i==0) {
                x=600851475143/i;
                numfac=x;
                System.out.println("este s Pimo"+i);
                
            }
        }
        
    }
}