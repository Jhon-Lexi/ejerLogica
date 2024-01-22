/**
 * AreadeunCirculo
 */
import java.util.Scanner;
public class AreadeunCirculo  {
    public static void main( String[] arg){
        double rad=0,va=0,p=3.1416;
        System.out.println("proporciona el valor del radio del circulo");
        Scanner leerDato = new Scanner(System.in);
        rad=leerDato.nextDouble();
        va=p*(rad*rad);
        System.out.println("Elvalor del area del circulo es: "+va);
    }
    
}