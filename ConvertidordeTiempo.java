import java.util.Scanner;

public class ConvertidordeTiempo {

    public static void main(String[] jump) {
        Scanner leerDato = new Scanner(System.in);
        int x=0;
        double valor =0, resultado =0;
        do {
            System.out.println("Convertidor de tiempo");
            System.out.println("selecciona una opcion del menu");
            System.out.println("1- Convertir Dias a Segundos");
            System.out.println("2- Convertir Dias a Horas");
            System.out.println("3- Presione 3 Para Finalizar");
            x =leerDato.nextInt();
            switch (x) {
                case 1:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Dias a Segundos");
                    System.out.println("Proporcione el numero de Dias en Horas");
                    valor = leerDato.nextDouble();
                    if (valor<0 ) {
                        System.out.println("NO SE ACEPTAN NUMEROS NEGATIVOS O CARACTERES");
                        break;
                    }
                    else{
                    resultado = valor*24 * 60 * 60;
                    System.out.println("tiene " + resultado + " segundos");
                }
                    break;
                case 2:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Dias a Horas");
                    System.out.println("Proporcione el numero de Dias");
                    valor = leerDato.nextDouble();
                    resultado = valor * 24;
                    System.out.println("Tiene " + resultado + " horas");
                    break;

                default:
                if (x!=8) {
                    System.out.println("dato invalido");
                } else {
                    
                
                    System.out.println("finaliza el programa");
                }
                    break;
            }
        } while (x != 8);
    }
}