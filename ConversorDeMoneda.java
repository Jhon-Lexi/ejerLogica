import java.util.Scanner;

public class ConversorDeMoneda {
    public static void main(String[] args) {
        double mx = 0, equivalente = 0;
        int op = 0;
        Scanner leerCantidad = new Scanner(System.in);

        do {
            System.out.println("CONVERSOR DE MONEDA ");
            System.out.println("SELECCIONE UNA OPCION ");
            System.out.println("1 PESOS MEXICANOS A YEN");
            System.out.println("2 PESOS MEXICANOS A DOLARES");
            System.out.println("3 PESOS MEXICANOS A EUROS");
            System.out.println("4 PESOS MEXICANOS A PESOS A PESOS COLOMBIANOS ");
            System.out.println("5 PESOS MEXICANOS A LIRA (MONEDA TURCA)");
            System.out.println("6 SALIR)");

            op = leerCantidad.nextInt();
            switch (op) {
                case 1:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Ingrese la cantidad de pesos que desea convertir a Yen");
                    mx=leerCantidad.nextDouble();
                    if (mx<0) {
                        System.out.println("Nose aceptan valores negativos");
                        break;
                    } else {
                         System.out.println(convertToYen(mx));
                        double toYen = convertToYen(mx);
                        System.out.println(toYen);
                    }
                    break;
                    case 2:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Ingrese la cantidad de pesos que desea convertir a Dolares");
                    mx=leerCantidad.nextDouble();
                     if (mx<0) {
                        System.out.println("Nose aceptan valores negativos");
                        break;
                    } else {
                        double toDolar=ConvertDolares(mx);
                        System.out.println(toDolar);
                       
                    }
                    break;
                    case 3:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Ingrese la cantidad de pesos que desea convertir a Euros");
                    mx=leerCantidad.nextDouble();
                     if (mx<0) {
                        System.out.println("Nose aceptan valores negativos");
                        break;
                    } else {
                        System.out.println(ConverEuros(mx));
                    }
                    break;
                    case 4:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Ingrese la cantidad de pesos que desea convertir a Pesos Colombianos");
                    mx=leerCantidad.nextDouble();
                     if (mx<0) {
                        System.out.println("Nose aceptan valores negativos");
                        break;
                    } else {
                        double toColombia=ConvertPesosColombianos(mx);
                        System.out.println(toColombia);
                    }
                    break;
                    case 5:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Ingrese la cantidad de pesos que desea convertir a Lira");
                    mx=leerCantidad.nextDouble();
                     if (mx<0) {
                        System.out.println("Nose aceptan valores negativos");
                        break;
                    } else {
                        System.out.println(ConvertLira(mx));
                    }
                    break;
                default:
                if (op<0) {
                    System.out.println("solo se aceptan numeros positivos");
                    break;
                } else {
                    
                    System.out.println("No se encuentra esta opcion favor desellecionar una opcion del menu.");
                }
                    break;
            }

        } while (op != 6);
    }
    public static double convertToYen(double mx) {
        double equivalente;
        equivalente= mx*8.34;

        return equivalente;

    }
    public static double ConvertDolares(double mx) {
        double equivalente;
        equivalente= mx*0.06;
        return equivalente;

    }
    public static double ConverEuros(double mx) {
        double equivalente;
        equivalente= mx*0.05;
        return equivalente;

    }
    public static double ConvertPesosColombianos(double mx) {
        double equivalente;
        equivalente= mx*229.59;
        return equivalente;

    }
    public static double ConvertLira(double mx) {
        double equivalente;
        equivalente= mx*1.67;
        return equivalente;

    }

}