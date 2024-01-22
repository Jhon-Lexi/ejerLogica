/**
 * NumeroMayorMenor
 */
import java.util.Scanner;
public class NumeroMayorMenor {

    public static void main(String[] arg){
        int a=0,b=0,c=0,mayor=0,menor=0;
        System.out.println("dame el primer numero");
        Scanner leerDato = new Scanner(System.in);
        a=leerDato.nextInt();
        System.out.println("segundo numero");
        b=leerDato.nextInt();
        System.out.println("tercer numero");
        c=leerDato.nextInt();
        if(a>b){
           if (a>c) {
            System.out.println("el numero mayor es: "+a);
            System.out.println("el numerp menoer es: "+c);
           }else{
            System.out.println("el numero mayor es: "+c);
            System.out.println("el numero menor es: "+a)
           }
        }else if (b>c) {
            System.out.println("este numero es mayor: "+b);
            System.out.println("el numero menor es: "+c)
        }else{
            System.out.println("este numero es mayor: "+c);
            System.out.println("este numero es menor: "+b)
        }
        
    }

}