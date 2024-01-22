public class MostrarProductosconPrecios {

    public static void main(String[] args) {
        String inventario[]={"pelota","libro","chocolate","silla"};
        Double precio[]={13.50,15.90,8.08,6.07};
        for(int p=0;p<=inventario.length-1;p++){
        System.out.println(inventario[p]+"="+precio[p]);
       

        }
    }
}