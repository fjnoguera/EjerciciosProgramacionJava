/*2-2. Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor
de edad o no. Implementa y utiliza la función:
boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario

 * Proyecto $(project.name} - Archivo Ej2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */
package ud5funciones;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 17 nov. 2021 21:18:09
 */
public class Ej2 {

    public static boolean esMayorEdad(int a) {

        if (a >= 18) {
            return true;
            
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int edad;
        Scanner in = new Scanner(System.in);

        System.out.print("Dime edad: ");
        edad = in.nextInt();

        boolean esMayor = esMayorEdad(edad);
        
        System.out.println("¿Es mayor de edad? =>" + esMayor);
           
    }

}
