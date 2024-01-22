import java.util.Scanner;
public class Imp10{
    public static void main(String[] yupi){
        int x=1;
        System.out.print("Escriba lo que desee  \n");
        Scanner leerDato = new Scanner(System.in);
        String palabra = leerDato.nextLine();
        while(x<=10){
            System.out.println(x+palabra );
            x++;
        }
    /*for(x=1;x<=10;x++){
            System.out.println(x+"."+palabra);

        }*/

    }   

}