import java.util.Scanner;

public class Descuento20PorcientoPorCada1000DeCompra {
    public static void main(String[] args) {
        float compra = 0;
        int x = 0;
        int op = 0;
        String dato = "", datog = "";
        do {
            System.out.println("Descuento del 20 porcioento por cada mil de compra");
            System.out.println("1 Presione esta tecla para iniciar a ingresar el la compra");
            System.out.println("2 Presione esta tecla para cerrar");
            Scanner leerDato = new Scanner(System.in);
            op = leerDato.nextInt();

            switch (op) {
                case 1:
                    System.out.println("********************");
                    System.out.println("Ingrese su nombre");
                    dato = leerDato.next();
                    System.out.println("ingrese el area de comida");
                    dato = leerDato.next();
                    System.out.println("ingrese el producto");
                    dato = leerDato.next();
                    System.out.println("ingrese ingrese  el precio");
                    compra = leerDato.nextFloat();
                    System.out.println("ingrese cantidad");
                    x = leerDato.nextInt();
                    System.out.println(getDinero(compra, x));
                    break;

                default:
                    break;
            }

        } while (op != 2);

    }

    public static float getDinero(float compra, int x) {
        float precio, descuento;
        precio = compra * x;
        if (precio < 1000.00) {
            System.out.println("cantidad a pagar" + precio);
            System.out.println("no hay descuento");
        } else {
            descuento = (precio * 20) / 100;
            precio = precio - descuento;
            System.out.println("si hay descuento");
            System.out.println("precio con 20% de descuento " + precio);
        }
        return precio;
    }

}
