import java.util.Scanner;

public class HolaMundo {
  public static void main(String[] paralelepipedo) {
    System.out.print("dame tu nombre");
    Scanner cp = new Scanner(System.in);
    String nombre = cp.nextLine();
    System.out.println(" hola mundo " + nombre);
  }
}
