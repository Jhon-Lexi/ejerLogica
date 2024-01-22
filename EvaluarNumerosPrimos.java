import java.util.Scanner;

public class EvaluarNumerosPrimos {
    public static void main(String[] pe) {
        int valor, op;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("ingresa un numero para evaluar \n");
            valor = leer.nextInt();
            if (valor >= 0) {
                if (valor % 2 == 0) {
                    System.out.println("par");
                } else {
                    System.out.println("impar ");

                }
            } else {

                System.out.println("solo se aceotan numeros enteros positivos");
            }
            System.out.println("Presiona 1 para continuar y evaluar un nuevo numero");
            op = leer.nextInt();
        } while (op == 1);
        System.out.println("termina el programa");

    }
}