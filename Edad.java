import java.util.Scanner;
public class Edad{
public static void main(String[] kl){
    int edad=0,x=1;
    System.out.println("proporcioname tu edad");
    Scanner cum = new Scanner(System.in);
    edad=cum.nextInt();
    while(x<=edad){
        System.out.println(+x);
        x++;
    }
    /*for(x=1;x<=edad;x++){
        System.out.println("edades que tuvo: "+x);
    }*/
}

}