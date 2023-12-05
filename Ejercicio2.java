/**
 * Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales, 
 * además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 * 
 * 
 * 
 * @author Manuel López Mairate
 */

public class Ejercicio2 {

    public static void main(String[] args){

        System.out.println("Inserte una cadena:");
        String cadena = System.console().readLine();
        System.out.println("Inserte otra cadena:");
        String cadena2 = System.console().readLine();
        
      
        //Dentro de el if, usaremos .equalsIgnoreCase para compararlo sin tener encuenta mayusculas y minusculas
        if(cadena.equals(cadena2))
        {
            System.out.println("Las dos cadenas son iguales");
        }else if (cadena.equalsIgnoreCase(cadena2)){
            System.out.println("Las dos cadenas son iguales, sin diferenciar mayusculas/minusculas");
        }else{
            System.out.println("Son cadenas diferentes");
        }
        System.out.println();
    }


    }


