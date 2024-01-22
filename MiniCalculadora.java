import java.util.Scanner;

public class MiniCalculadora {

    public static void main(String[] lp) {
        int numero = 0;
        double valor1 = 0, valor2 = 0, resultado = 0;
        Scanner leerDato = new Scanner(System.in);
        do {
            System.out.println("Calculadora Basica");
            System.out.println("selecciona una opcion del menu");
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicacion");
            System.out.println("4- Division");
            System.out.println("5- Para Salir Presione El Numero 9");
            numero = leerDato.nextInt();
            switch (numero) {
                case 1:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Proporciona dos numeros para sumar");
                    System.out.println("ingrese el valor");
                    valor1 = leerDato.nextDouble();
                    System.out.println("ingrese segundo valor");
                    valor2 = leerDato.nextDouble();
                    resultado = valor1 + valor2;
                    System.out.println("el valor de la suma de " + valor1 + "+" + valor2 + "=" + resultado + "\n");
                    break;
                case 2:
                    System.out.println("\033[H\033[2J");
                    System.out.println("proporcina lo valores para realizar la resta: ");
                    System.out.println("ingrese primer valor");
                    valor1 = leerDato.nextDouble();
                    System.out.println("ingrese segundo valor");
                    valor2 = leerDato.nextDouble();
                    resultado = valor1 - valor2;
                    System.out.println("el valor de la resta  de " + valor1 + "-" + valor2 + "=" + resultado + "\n");
                    break;
                case 3:
                    System.out.println("\033[H\033[2J");
                    System.out.println("proporcina lo valores para realizar la Multiplicacion: ");
                    valor1 = leerDato.nextDouble();
                    System.out.println("ingrese segundo valor");
                    valor2 = leerDato.nextDouble();
                    resultado = valor1 * valor2;
                    System.out.println("la operacion es" + valor1 + "*" + valor2 + "=" + resultado);
                    break;
                case 4:
                    System.out.println("\033[H\033[2J");
                    System.out.println(
                            "proporcina lo valores para realizar la Division recuerde que el segundo valor debe ser diferente de 0: ");
                    System.out.println("ingrese primer valor");
                    valor1 = leerDato.nextDouble();
                    System.out.println("ingrese segundo valor");
                    valor2 = leerDato.nextDouble();
                    resultado = valor1 / valor2;
                    System.out.println("la operacion es" + valor1 + "/" + valor2 + "=" + resultado);

            }

        } while (numero != 9);

    }
}