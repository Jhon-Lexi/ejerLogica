import java.util.Scanner;

public class PalabraDentrodeunArreglo {
    public static void main(String[] yelp) {
        int x = 0;
        String[] palabra = {};
        System.out.println("ingrese una palabra: ");
        Scanner leerDato = new Scanner(System.in);
        palabra = leerDato.nextLine();
        for (x = 0; x < palabra; x++) {
            System.out.println(palabra);
        }

    }

}