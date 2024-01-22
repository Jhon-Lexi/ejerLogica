import java.util.Scanner;
public class Funciones {
    
     public static void main(String[] BD) {
        int x;
       saludar("johan","garcia");
       System.out.println("proprociona tres valores para hacer una mutiplicacion");
      x= withValor(2, 2, 4);
       System.out.println(x);

    }
    public static void saludar(String nombre ,String apellido ){
        System.out.println("hola soy  : "+nombre+" "+apellido);
    }
    public static int withValor(int x,int y,int z){
        return x*y*z;
    }

}