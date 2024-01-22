import java.util.Scanner;

public class Ingresar10NumerosyevaluarelMayoryelMenor {
    public static void main(String[] args) {
        int mayor = 0, menor = 0 ,valor=0;
        int[] numeros = new int[11];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 11; i++) {
            System.out.println("ingresa 10 numeros : " + (i) + "a evaluar");
            numeros[i] = leer.nextInt();

        }
        for (int i = 0; i < numeros.length; i++) {
            if (mayor < numeros[i]) {
                mayor = numeros[i];
            }else{

                menor = numeros[i];
                if (valor> menor) {
                    valor=menor;
                    
                    System.out.println("www"+menor);
                }
            }
            // if(menor){
                
            // }
        }
        System.out.println("este s el mayor "+mayor+" este es menor"+menor );
    }
}