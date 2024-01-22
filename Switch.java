import java.util.Scanner;

public class Switch {

    public static void main(String[] gt) {
        int x = 0;
        do {
            System.out.println("selecciona una opción");
            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("0.- Finalizar");
            Scanner sc =new Scanner(System.in);
        
             x = sc.nextInt();

            switch (x) {
                case 1:
                int resSum=Math.addExact(4, 7);
                
                    System.out.println("Suma: "+resSum);
                    break;
                case 2:
                    System.out.println("Resta");
                    break;
                case 3:
                    System.out.println("Multiplicacion");
                
                break;
                default:
                System.out.println("Se ha finalizado el programa");
                    break;
            }
    

        }while(x>0);
    }

}