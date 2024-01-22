import java.util.Scanner;

public class MinicalculadoraFunciones {
    public static void main(String[] wii) {
        int numero = 0 ,x=0;
        float valor1 = 0, valor2 = 0, resultado=0;
        Scanner leerDato = new Scanner(System.in);
        do {
            System.out.println("selelcione un una opcion del menu");
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicacion");
            System.out.println("4- Division");
            System.out.println("5- Salir");
            numero = leerDato.nextInt();
            switch (numero) {
                case 1:
                
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                        System.out.println("suma de dos numero");
                        System.out.println("ingrese el primer valor");
                        valor1=leerDato.nextFloat();
                        System.out.println("ingrese el segundo valor");
                        valor2=leerDato.nextFloat();
                        resultado=suma(valor1,valor2);
                        System.out.println(resultado);
                        break;
                        case 2:
                        
                        System.out.println("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Resta de dos numero");
                        System.out.println("ingrese el primer numero");
                        valor1=leerDato.nextFloat();
                        System.out.println("ingrese el segundo numero");
                        valor2=leerDato.nextFloat();
                        resultado=resta(valor1,valor2);
                        System.out.println(resultado);
                        
                        break;
                        case 3:
                        
                        System.out.println("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Multiplicacion de dos numeros");
                        System.out.println("Ingrese el primer valor");
                        valor1=leerDato.nextFloat();
                        System.out.println("Ingrese el segundo valor");
                        valor2=leerDato.nextFloat();
                        resultado=multiplicacion(valor1,valor2);
                        System.out.println(resultado);
                        
                        break;
                        case 4:
                        
                        System.out.println("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("Division de dos numeros");
                        System.out.println("Ingrese el primer valor");
                        valor1=leerDato.nextFloat();
                        System.out.println("Ingrese el segundo valor");
                        valor2=leerDato.nextFloat();
                        resultado=division(valor1,valor2);
                        System.out.println(resultado);

                    break;

                default:
                System.out.println("no esta esta opcion");
                    break;
            }
        } while (numero != 5);

    }



    public static float suma(float valor1, float valor2) {
        return valor1 + valor2;

    }

    public static float resta(float valor1, float valor2) {
        return valor1 - valor2;

    }

    public static float multiplicacion(float valor1, float valor2) {
        return valor1 * valor2;

    }

    public static float division(float valor1, float valor2) {
        return valor1 / valor2;

    }
}