import java.util.Scanner;

public class AreadeFigurras {

    public static void main(String[] pt) {
        int numero = 0;
        double valor1 = 0, valor2 = 0, resultado = 0, p = 3.1416;
        Scanner leerDato = new Scanner(System.in);
        do {
            System.out.println("Calculador de Areas");
            System.out.println("selecciona una opcion del menu");
            System.out.println("1- Area de un circulo");
            System.out.println("2- Area de un Rectangulo");
            System.out.println("3- Area de un Triangulo");
            System.out.println("4- Area de un Cuadrado");
            System.out.println("5- Para Salir Presione El Numero 5");
            numero = leerDato.nextInt();
            switch (numero) {
                case 1:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Proporcione los valores del Circulo");
                    System.out.println("ingrese el valor del radio");
                    valor1 = leerDato.nextDouble();
                    if (valor1 < 0) {
                        System.out.println("no se aceptan numeros negativos");
                        break;
                    } else {

                        resultado = p * (valor1 * valor1);
                        System.out.println("el valor del area es : " + resultado + "\n");
                    }
                    break;

                case 2:

                    System.out.println("\033[H\033[2J");
                    System.out.println("proporcina lo valores para obtener el area del rectangulo: ");
                    System.out.println("ingrese la altura");
                    valor1 = leerDato.nextDouble();
                    System.out.println("ingrese la base");
                    valor2 = leerDato.nextDouble();
                    if (valor1 < 0 || valor2 < 0) {
                        System.out.println("Nose aceptan numeros negtivos");
                        break;
                    } else {

                    }
                    resultado = (valor1 * valor2);
                    System.out.println("el valor del area es: " + resultado + "\n");
                    break;

                case 3:

                    System.out.println("\033[H\033[2J");
                    System.out.println("proporcina la altura");
                    valor1 = leerDato.nextDouble();
                    System.out.println("ingrese la base");
                    valor2 = leerDato.nextDouble();
                    if (valor1 < 0 || valor2 < 0) {
                        System.out.println("Nose aceptan nmeros negativos");
                        break;
                    } else {
                        resultado = (valor1 * valor2) / 2;
                        System.out.println("el resultado es: " + resultado);

                    }
                    break;
                case 4:

                    System.out.println("\033[H\033[2J");
                    System.out.println("ingrese los numeros para calcular el area del cuadrado");
                    System.out.println("ingrese el numero de un lado");
                    valor1 = leerDato.nextDouble();
                    if (valor1 < 0) {
                        System.out.println("no se aceptan nmeros negativos");
                        break;
                    } else {

                        resultado = valor1 * valor1;
                        System.out.println("el resultado es : " + resultado);
                    }
                    break;
                default:
                System.out.println("\033[H\033[2J");
                        System.out.flush();
                    System.out.println("Numero invalido desea cerrar el prgrama presione 5");
                    break;

            }

        } while (numero != 5);

    }
}