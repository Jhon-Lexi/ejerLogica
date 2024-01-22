import java.util.Scanner;

public class ArreglosEjercicio {
    public static void main(String[] michi) {
        String x = "";
        String[] frutas = new String[5];
        int p = 0;

        Scanner leerDato = new Scanner(System.in);
        
        do {
            
            System.out.println("Proporciona el nombre de una fruta: ");
            x = leerDato.nextLine();
            frutas[p]=x;
            // System.out.println("este es el nombre de la fruta propuesta: \n" + x);
            p++;
        } while (p<5);

        for(int i=0;i<=frutas.length-1;i++){
            // System.out.println(p);
            System.out.println(frutas[p-1]);
        }

        /*
         * System.out.println("proprociona el nonbre de una fruta: ");
         * Scanner leerDato = new Scanner(System.in);
         * x=leerDato.next();
         */

    }

}