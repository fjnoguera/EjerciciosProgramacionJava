/*9. Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el
más  elevado.   Impleméntalo   creando   únicamente   una   función   a   la   que   le   pasemos   dos
valores (no tres) y nos devuelva el máximo de los dos valores.
 * Proyecto $(project.name} - Archivo Ej9.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */
package ud5funciones;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 20:02:44
 */
public class Ej9 {

    public static int maximo(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String[] args) {

        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.println("Dime número a");
        a = in.nextInt();
        System.out.println("Dime número b");
        b = in.nextInt();
        System.out.println("Dime número c");
        c = in.nextInt();

        if (maximo(a, b) > c) {
            System.out.println("El mayor es " + maximo(a, b));

        } else {
            System.out.println("El mayor es " + c);
        }

    }
}

