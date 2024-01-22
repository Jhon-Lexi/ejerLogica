import java.util.Scanner;
public class MostrarunaPalabraLetraporLetraysuSumadesusCaracteres {

    public static void main(String[] Aghra) {
        int texto=0;
        System.out.println("ingresa una palabra" );
        Scanner dato=new Scanner(System.in);
        String palabra=dato.nextLine();
        System.out.println(palabra.length());
        char caracteres[]=new char[palabra.length()];
        for(int i=0;i<palabra.length();i++){
            texto=texto+1;
            caracteres[i]=palabra.charAt(i);
            System.out.println(caracteres[i]);

        }
        System.out.println("suma de las letras : "+texto);
    }
}