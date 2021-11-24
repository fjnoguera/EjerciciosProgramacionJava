/*12.-Realiza   un   programa   que   dado   un   valor   en   kilómetros   nos   lo   traduce   a   millas.   El
programa debe tener una función que reciba como parámetro una cantidad en kilómetros
y nos la devuelva en millas
 * Proyecto $(project.name} - Archivo Ej12.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */

package ud5funciones;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 20:40:01
 */
public class Ej12 {
    
    public static double kilometros_a_millas(double kilometros) {

        return kilometros / 1.60934;
    }

    public static void main(String[] args) {

        double kilometros;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca los kilometros a convertir");
        kilometros = in.nextDouble();

        System.out.println("El total de millas es de:  " + kilometros_a_millas(kilometros));

    }

}


