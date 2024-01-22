import java.util.Scanner;
public class Multi20                    
{
    public static void main(String[] pt) 
    {
        int p,num,res;
        System.out.println("dame un numero para sacar su resultado de las multiplicaciones del 1 al 20");
        Scanner leerDato = new Scanner(System.in);
        num= leerDato.nextInt() ;

        for(p=1;p<=20;p++)
        {
        res=num*p;
        System.out.println(num+"x"+p+"="+res);
        }
    }
}