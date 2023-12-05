/**
 * Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra 
 * de la cadena en una línea distinta.

 * 
 * @author Manuel López Mairate
 */

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println("Inserte una cadena:");
        String cadena = System.console().readLine();

        //Array con un .split para separar con un espacio las variables
        String[] array = cadena.split(" ");
        for (int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }

    }

}
