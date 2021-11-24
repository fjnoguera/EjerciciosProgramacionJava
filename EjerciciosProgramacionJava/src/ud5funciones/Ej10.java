/*10.- Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y
nos diga si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días.
Se debe crear una función donde le pasemos los datos y devuelva si es correcta o no

 * Proyecto $(project.name} - Archivo Ej10.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */
package ud5funciones;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 20:20:36
 */
public class Ej10 {

    public static boolean fecha(int a, int b, int c) {

        if ((a <= 30 && a > 0) && (b <= 12 && b > 0) && c < 2022) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.println("Dime el día ");
        a = in.nextInt();
        System.out.println("Dime el mes");
        b = in.nextInt();
        System.out.println("Dime el año ");
        c = in.nextInt();

        if (fecha(a, b, c) == true) {
            System.out.println("Fecha correcta");

        } else {
            System.out.println("Fecha incorrecta");
        }

    }
}


