/**
 * Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego 
 * mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres 
 * primeras letras de cada uno de ellos. 
 * 
 * @author Manuel López Mairate
 */

public class Ejercicio3 {
    public static void main(String[] args) {


        System.out.println("Inserte un nombre");
        String nombre = System.console().readLine();
        System.out.println("Inserte el primer apellido");
        String apellido1 = System.console().readLine();
        System.out.println("Inserte el segundo apellido");
        String apellido2 = System.console().readLine();

        //Utilizando el metodo substring agarramos las tres primeras palabras y con toUpperCase lo convertiremos en mayusculas
        String newnombre= nombre.substring(0, 3).toUpperCase();
        String newapellido1 = apellido1.substring(0, 3).toUpperCase();
        String newapellido2 = apellido2.substring(0, 3).toUpperCase();

        System.out.print(newnombre);
        System.out.print(newapellido1);
        System.out.print(newapellido2);
    }
}
