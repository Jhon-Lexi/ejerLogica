
/**
 * Operaciones
 */
import java.util.Scanner;

public class Operaciones {
   public static void main(String[] arg) {
      float a = 0, b = 0, s = 0, r = 0, d = 0, m = 0;
      System.out.println("proporcioname un numero a evaluar para las operacione basicas");
      Scanner leerDato = new Scanner(System.in);
      a = leerDato.nextFloat();
      System.out.println("Proporciona el segundo valor para la operacion");
      b = leerDato.nextFloat();
      s = a + b;
      r = a - b;
      d = a / b;
      m = a * b;
      if (a != 7) {
         System.out.println("la resta de los numeros es :" + r);

         System.out.println("ls division de los numeros es: " + d);
      } else {
         System.out.println("la suma de estos numeros es: " + s);
         System.out.println("la multiplicacion de los numeros es: " + m);
      }

   }

}