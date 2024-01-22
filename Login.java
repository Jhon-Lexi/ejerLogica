
import java.util.Scanner;

public class Login {

    public static void main(String[] pr) {
        String dato = "", pass;
        
        int id = 0, x = 0;
        boolean response;

        Scanner leerDato = new Scanner(System.in);
            
        
        do {
            System.out.println("\033[H\033[2J");
            System.out.flush();
            System.out.println("BIENVENIDOS A LA TIENDA LA SUERTE");
            // System.out.println("INGRESE SU NOMBRE:");
            // dato=leerDato.nextLine();
        
            System.out.println("INGRES SU ID DE USUARIO :");
            dato = leerDato.nextLine();
            System.out.println("INGRES SU CONTRASENA :");
            pass = leerDato.nextLine();
        
            response = loginUser(dato, pass);
            System.out.println(response);
    } while (response==false);


        do{
            // if (response == true) {
            // System.out.println("Acceso autorizado");
            // System.out.println("\033[H\033[2J");
            // System.out.flush();
            System.out.println("Tienda de la Suerte");
            System.out.println("bienvenido Johan;Quedeseas hacer: ");
            System.out.println("1 ver todos los productos");
            System.out.println("2 agregar productos");
            System.out.println("3 Eliminar Productos");
            System.out.println("4 agregar vendedor");
            System.out.println("5 editar producto");
            System.out.println("6 editar vendedor");
            System.out.println("7 eliminar vendedor");
            System.out.println("8 agregar cliente");
            System.out.println("9 eliminar cliente");
            System.out.println("10 editar cliente");
            System.out.println("11 salir");
            x = leerDato.nextInt();
            switch (x) {
                case 1:
                System.out.println("Lista de productos");
                System.out.println("\033[H\033[2J");
                System.out.flush();
                    
                    break;
                case 2:
                System.out.println("\033[H\033[2J");
                System.out.println("Agregar productos");
                    
                    break;
                case 3:
                System.out.println("\033[H\033[2J");
                System.out.println("eliminar productos");
                    
                    break;
                case 4:
                System.out.println("agregar vendedor");
                    
                    break;
                case 5:
                System.out.println("editar producto");
                    
                    break;
                case 6:
                System.out.println("editar vendedor");
                    
                    break;
                case 7:
                System.out.println("eliminar vendedor");
                    
                    break;
                case 8:
                System.out.println("agregar cliente");
                    
                    break;
                case 9:
                System.out.println("eiminar cliente");
                    
                    break;
                case 10:
                System.out.println("editar cliente");
                    
                    break;
                    
            
                default:
                    break;
            }
          

        // } else {
        //     System.out.println("Acesso denegado");
        // }
    }while(x!=11);

    }

    public static boolean loginUser(String correo, String pass) {
        String correo2 = "a@g.com", pass2 = "123";

        // System.out.println(correo.getClass());
        // System.out.println("a@g.com"=="a@g.com");ftdfhcchgvhyh

        // System.out.println(correo=="a@g.com" );
        // System.out.println(pass == "123");
        if (correo2.equals(correo) && pass2.equals(pass)) {
            return true;
        } else {
            return false;
        }

    }

}