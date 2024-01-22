import java.util.Scanner;
public class InversionAnualWhile{
    public static void main(String[] lop){
        int years=0,x=1;
        double interes=0,interesGenerado=0,montoinvertido=0,montototal=0;
        System.out.println("pon el monto a invertir");
        Scanner leer=new Scanner(System.in);
        montoinvertido=leer.nextDouble();
        System.out.println("ingresa tasa de interes en decimal");
        interes=leer.nextDouble();
        System.out.println("tiempo de anualidad");
        years=leer.nextInt();
        while(x<=years){
            interesGenerado=montoinvertido*interes;
            montototal=interesGenerado+montoinvertido;
            System.out.println("anualida"+years+"cantidad con interes"+montototal);
            montoinvertido=montototal;
            x++;
        }
    }
}