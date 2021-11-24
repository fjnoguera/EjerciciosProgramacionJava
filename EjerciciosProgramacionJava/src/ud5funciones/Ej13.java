/*13.-Realiza   un   programa   que   calcule   el   porcentaje   de   descuento   que   nos   han   hecho   al
comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad con el descuento
aplicado. Se debe crear una función a la que le pasemos ambos valores y nos devuelva
el descuento.

 * Proyecto $(project.name} - Archivo Ej13.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */

package ud5funciones;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 20:44:34
 */
public class Ej13 {public static double descuento(double a, double b) {

       return ((a-b)/a)*100;

    }

    public static void main(String[] args) {

        double a, b;
        Scanner in = new Scanner(System.in);

        System.out.println("Dime el precio sin descuento ");
        a = in.nextDouble();
        System.out.println("Dime el precio con descuento ");
        b = in.nextInt();
        

        System.out.println("El porcentage de descuento ha sido de " + descuento(a,b) + " % ");
        }

    }





