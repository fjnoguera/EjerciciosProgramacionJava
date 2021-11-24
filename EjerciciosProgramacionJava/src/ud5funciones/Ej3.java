/*3. Escribe un programa que pida dos números enteros por teclado y muestre por pantalla
cual es el mínimo. Implementa y utiliza la función:
int minimo(int a, int b) // Devuelve el menor entre a y b


 * Proyecto $(project.name} - Archivo Ej3.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */
package ud5funciones;

import java.util.Scanner;
import static ud5funciones.UD5FUNCIONES.multiplica;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 17 nov. 2021 21:30:26
 */
public class Ej3 {

    public static int minimo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        int a, b;
        Scanner in = new Scanner(System.in);

        System.out.println("Dime número a");
        a = in.nextInt();
        System.out.println("Dime número b");
        b = in.nextInt();

        System.out.println("El mínimo es " + minimo(a,b));

    }

}


