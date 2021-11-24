/*1.  Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
resultado de multiplicarlos. Implementa y utiliza la función:
double multiplica(double a, double b) // Devuelve la multiplicación de dos números


 * Proyecto $(project.name} - Archivo UD5FUNCIONES.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */
package ud5funciones;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 17 nov. 2021 21:11:13
 */
public class UD5FUNCIONES {

    public static double multiplica(double a, double b) {

        return a * b;
    }

    public static void main(String[] args) {

        double a, b;
        Scanner in = new Scanner(System.in);

        System.out.println("Dime a");
        a = in.nextDouble();
        System.out.println("Dime b");
        b = in.nextDouble();

        double res = multiplica(a, b);

        System.out.println("Resultado:" + res);

    }

}
