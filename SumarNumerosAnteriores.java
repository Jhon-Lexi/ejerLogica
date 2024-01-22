import java.util.Scanner;
public class SumarNumerosAnteriores{
    public static void main(String[] tite) {
        int numero=0,x,resultado=0,xi=0;
     System.out.println("dame un numero enteromprar sumar con sus antesesores: \n");
     Scanner leer=new Scanner(System.in);
        numero=leer.nextInt();
        for(x=0;x<=numero;x++){
           
            resultado=x+xi;
            xi=resultado;
            
            //System.out.println(x+"\n");
        }
        System.out.println("el resultado es: "+resultado);
       
    }
}