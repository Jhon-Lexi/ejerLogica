import java.util.Scanner;

import java.util.Scanner;
public class InversionAnual{
public static void main(String[] inversion){
    int tiempo=0,x;
    double montoinvertido=0,interes=0,montototal=0,interesGenerado=0;
    System.out.println("proporcione el monto a  invertir : ");
    Scanner leerDato = new Scanner(System.in);
    montoinvertido=leerDato.nextDouble();
    System.out.println("\n indique a tasa de interes: ");
    interes=leerDato.nextDouble();
    System.out.println("\n determine la cantidad de tiempo que desea invertir anualmente: ");
    tiempo=leerDato.nextInt();
    for(x=1;x<=tiempo;x++){

        interesGenerado =montoinvertido*interes;
        montototal=montoinvertido+interesGenerado;
        System.out.println("\n"+x+". tu monto de inversion de anual"+montototal);
        montoinvertido=montototal;
    }
        
     
}
}