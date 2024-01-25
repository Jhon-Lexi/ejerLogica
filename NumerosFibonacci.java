import java.util.Scanner;
public class NumerosFibonacci {

    public static void main(String[] gs) {
        int y=0;
        
        do {
            Scanner leerDato=new Scanner(System.in);
            System.out.println("Suma de numeros fibonnaci menores a 400,000");
            System.out.println("1 Presiona para ver la suma total de los numeros fibonacci pares.");
            System.out.println("2 Salir");
            y = leerDato.nextInt();
            switch (y) {
                case 1:
                System.out.println("\033[H\033[2J");
                System.out.flush();
                
                SerieFionacci();
                 
                    break;

                default:
                    System.out.println("no se encuemtra esta opcion en el menu");
                    break;
            }

        } while (y!=2);
        
    }
    public static int SerieFionacci( ) {
        int a=0,b=1,c=2,x=0;
        for(int i=0;i<=4000000;i++){
            a=b+c;
            b=c;
            c=a;
            if (a>4000000) {

                break;
            }
            if (a%2==0) {
               x =x+a;
            }
            System.out.println(x);
           
        }
        return a;

    }
}