import java.util.Scanner;

public class PropinaSobrelaCuenta {

    public static void main(String[] hola) {
        int cuenta = 0, x = 0;
        
        do {
            System.out.println("Calculadorade de propina con importe del 20%");
            System.out.println("1 inicia operacion");
            System.out.println("2 cierra programa");
            Scanner leer = new Scanner(System.in);
            x = leer.nextInt();
            switch (x) {
                case 1:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Ingresa su cuenta a pagar: ");
                    cuenta = leer.nextInt();

                    if (cuenta > 0) {
                        
                        System.out.println("cuenta: " + cuenta);
                        System.out.println("propina a dejar: " + obtenerPropina(cuenta));

                        break;
                    } else {
                        System.out.println("solo se aceptan numeros positivos");

                    }

                    break;

                default:
                    if (x == 2) {
                        System.out.println("Hasta pronto");
                    } else {

                        System.out.println("Nose encuentra esta opcion");
                    }
                    break;
            }

        } while (x != 2);
    }

    public static float obtenerPropina(int cuenta) {
        float propina;
        propina = (cuenta * 20) / 100;
        return propina;
    }
}