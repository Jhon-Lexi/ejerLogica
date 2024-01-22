import java.util.Scanner;
public class RepeticionesenFormaPiramide{
    public static void main(String[] arg){
        int num=0,i=0,k=0;
        String l="*",v="";
        System.out.println("proporciona un numero entero: ");
        Scanner numero= new Scanner(System.in);
        num=numero.nextInt();
            for(i=num;i>=1;i--){
                // System.out.println("* ");
                System.out.println(v);
                
                for(k=i;k>=1;k--){
                    
                    
                    System.out.print("* ");
                 
                }

            }

    }
}