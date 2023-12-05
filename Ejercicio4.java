/**
 * 
 */

public class Ejercicio4 {
    public static void main(String[] args){
        //Cantidad de letras que hay
        int contadora = 0;
        int contadore = 0;
        int contadori = 0;
        int contadoro = 0;
        int contadoru = 0;

        
        System.out.println("Inserta una frase");
        String palabra = System.console().readLine();

        //Es un for que va procesando poco a poco la frase y un contador para contar la cantidad de letras
        for (int i = 0;i<palabra.length();i++) {
            if ((palabra.charAt(i)=='a')){ 
                contadora++;
        }

         if ((palabra.charAt(i)=='e')){ 
                contadore++;
        }

         if ((palabra.charAt(i)=='i')){ 
                contadori++;
        }

         if ((palabra.charAt(i)=='o')){ 
                contadoro++;
        }
        if ((palabra.charAt(i)=='u')){ 
                contadoru++;
        }
    }

        System.out.println("Cantidad de A: " + contadora);
        System.out.println("Cantidad de E: " + contadore);
        System.out.println("Cantidad de I: " + contadori);
        System.out.println("Cantidad de O: " + contadoro);
        System.out.println("Cantidad de U: " + contadoru);
}
}
