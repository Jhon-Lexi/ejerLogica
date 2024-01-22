import java.util.Scanner;
public class Numeros{
    public static void main(String[] lexi){
        int num,x;
        System.out.println("introduce un numero para ver la secuencia");
        Scanner leerDato = new Scanner(System.in);
        num=leerDato.nextInt();
        for(x=1;x<=num;x++){
            if(x%2==1){
                System.out.println(+x);
            
                
            }
        }
    }
}