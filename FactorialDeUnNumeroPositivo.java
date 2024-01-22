import java.util.Scanner;

public class FactorialDeUnNumeroPositivo {
    public static void main(String[] pp) {
        int x = 0 , fac=0;
        Scanner leerDato = new Scanner(System.in);
        do {
            System.out.println("factorial de un numero");
            System.out.println("seleccione una opcion");
            System.out.println("1 ingresar numero");
            System.out.println("2 salir");
            x = leerDato.nextInt();
            switch (x) {
                case 1:
                    if (x <= 0) {
                        System.out.println("solo acepta numeros positivos");
                    } else {
                        System.out.println("Ingrese un numeros");
                        fac = leerDato.nextInt();
                       
                       System.out.println( getFact(fac));
                    }
                    break;

                default:

                    System.out.println("favor de ingresar otro numero");
                    break;
            }

        } while (x != 2);

    }

    public static int getFact(int fajc) {

        int i, aux = 0 ,y=1;
        
        if (fajc < 0) {
            System.out.println("no se abmiten numeros negativos");
        } else {

            for (i = fajc; i >= 1; i--) {
                aux = y * i;
                y= aux;

                // System.out.println("el resultado del factorisl es : " + aux);
                
            }

        }
        return aux;
    }

}