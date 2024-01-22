public class DatosdelUsuario {

    public static void main(String[] args) {
        String nombre[]={"Citlalli","Maria","Tadeo"},sexo[]={"Femenino","Masculino"};
        int edad[]={23,25,28};
        for(int h=0;h<=nombre.length-1;h++){
            if(nombre[h]=="Tadeo"){

                System.out.println("nombre: "+nombre[h]+" edad: "+edad[h]+" sexo: "+sexo[1]);
            }else{

                System.out.println("nombre: "+nombre[h]+" edad: "+edad[h]+" sexo: "+sexo[0]);
            }
        }
}
}
