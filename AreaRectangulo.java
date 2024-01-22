/**
 * AreaRectangulo
 */
import java.util.Scanner;
public class AreaRectangulo {
  public static void main(String[] arg)
  {
    int bas=0,alt=0,are=0;
    System.out.println("dame la base del rectangulo");
    Scanner leerDato = new Scanner(System.in);
    bas=leerDato.nextInt();
    System.out.println("dame la altura del rectangulo");
    alt=leerDato.nextInt();
    are=(bas*alt);
    System.out.println("el area de el rectangulo: "+are);
  }
    
}