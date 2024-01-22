import java.util.Scanner;
public class FuncionHolaAmiga {
public static void main(String[] args) {
    int x=0;
    String nombre="";
    Scanner leerDato=new Scanner(System.in);
    do {
        System.out.println("selecciona una opcion");
    System.out.println("1 presiona esta tecla para un saludo");
    System.out.println("2 salir");
    x=leerDato.nextInt();
    switch (x) {
        case 1:
            System.out.println("ingrese su nombre");
            nombre=leerDato.next();
            toMyFriend(nombre);
            break;
    
        default:
        System.out.println("opcion no valida");
            break;
    }
    } while (x!=2);
}
public static void toMyFriend(String nombre){
    
    System.out.println("hola amiga , "+nombre);
    
}
    
}