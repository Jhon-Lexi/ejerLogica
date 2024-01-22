import java.util.Scanner;
public class ContadorCero{
    public static void main(String[] pm){
      int j=0,k=0;
      System.out.print("dame un numero entero para decrementar  \n");
      Scanner valor = new Scanner(System.in);
     k=valor.nextInt();
     if(k<1){
      System.out.println("solo se aceptan números positivos");
     }else{

       while(k>=0){
         System.out.println(+k);
         k--;
        }
      }

     /*for(j=k;j>=0;j--){
        System.out.println("numeros : "+j+",");
       }*/
    }
}