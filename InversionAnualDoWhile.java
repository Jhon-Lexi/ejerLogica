import java.util.Scanner;

public class InversionAnualDoWhile {
    public static void main(String[] tite) {
        int years = 0, x = 1;
        double montoinvertido = 0, montototal = 0, interes = 0, interesGenerado = 0;
        System.out.println("pon el monto a invertir");
        Scanner leer = new Scanner(System.in);
        montoinvertido = leer.nextDouble();
        System.out.println("ingresa tasa de interes en decimal");
        interes = leer.nextDouble();
        System.out.println("tiempo de anualidad");
        years = leer.nextInt();
        do {
            interesGenerado = interes * montoinvertido;
            montototal = montoinvertido + interesGenerado;
            System.out.println("monto de interes anual" + montototal);
            montoinvertido = montototal;
            x++;
        } while (x <= years);

    }
}