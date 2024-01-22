import java.util.Scanner;
// Este codigo evalua el ombre proporcionadado por el ususraio y solo se termina cuando coloque la palabra correcta
public class FrutaSecreta {
    public static void main(String[] arg) {
        String fruta = "";

        do {
            System.out.println("Escribe el nombre de una fruta y poder saber si ganaste");

            Scanner leerDato = new Scanner(System.in);
            fruta = leerDato.nextLine();

        } while (!fruta.equals("fresa"));
        System.out.println("ganaste");
    }
}