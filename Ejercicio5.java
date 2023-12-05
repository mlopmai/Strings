/**
 * Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o  no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). 
 * Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
 * palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda
 * 
 * @author Manuel López Mairate
 */

public class Ejercicio5 {

    public static void main(String[] args) {
        

        System.out.println("Ingrese una frase: ");
        String fraseUsuario = System.console().readLine();

        // Eliminar espacios y convertir a minúsculas
        String fraseProcesada = fraseUsuario.replaceAll("\\s", "").toLowerCase();

        // Verificar si la frase es un palíndromo con un boolean
        boolean esPalindromo = true;
        int longitud = fraseProcesada.length();

        // For que agarra de uno en uno las palabras de la frase
        for (int i = 0; i < longitud / 2; i++) {
            if (fraseProcesada.charAt(i) != fraseProcesada.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }


        if (esPalindromo) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
    }
}


