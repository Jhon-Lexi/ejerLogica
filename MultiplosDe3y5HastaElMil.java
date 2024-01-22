import java.util.Scanner;

public class MultiplosDe3y5HastaElMil {
    public static void main(String[] simba) {
        int x = 0,i=0,k=10001;
        Scanner leerDato = new Scanner(System.in);
        do {
            System.out.println("Multiplos de 3 y 5");
            System.out.println("1 Presiona para ver los multiplos de 3 y 5");
            System.out.println("2 Salir");
            x = leerDato.nextInt();
            switch (x) {
                case 1:
                System.out.println("\033[H\033[2J");
                System.out.flush();

                       System.out.println( obtenerMultiplos(k));
                 
                    break;

                default:
                    System.out.println("no se encuemtra esta opcion en el menu");
                    break;
            }

        } while (x != 2);
    }

    public static int obtenerMultiplos( int k) {
        int i,resultado=0;
        
        for (i = 1; i < k; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                // System.out.println(i);1
                resultado=resultado+i;
                // System.out.println(resultado);
            } 
        }
        return resultado;
    }

}