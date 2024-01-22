import java.util.Scanner;

public class CadenaNombre {
    public static void main(String[] args) {
        int x = 0;
        Scanner leerDato = new Scanner(System.in);
        do {
            System.out.println("selecciona una opcion");
            System.out.println("1 presiona esta tecla para un saludo");
            System.out.println("2 salir");
            x=leerDato.nextInt();
            switch (x) {

                case 1:

                    toFriend("ww");
                    break;

                default:
                    System.out.println("no estaesta opcion");
                    break;
            }
        } while (x != 2);
    }

    public static void toFriend(String vvv) {
        String nombre = "";
        Scanner leer=new Scanner(System.in);
        System.out.println("proporcione su nombre ");
        nombre = leer.nextLine();
        System.out.println("Hola amiga, " + vvv);

    }

}