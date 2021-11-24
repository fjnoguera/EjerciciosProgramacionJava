/*5. Escribe   un   programa   que   pida   un   valor   entero   en   millas   y   muestre   su   equivalente   en
kilómetros.   Recuerda   que   una   milla   son   1,60934   kilómetros.   Implementa   y   utiliza   la
función:
double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros

 * Proyecto $(project.name} - Archivo Ej5.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */
package ud5funciones;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 18:12:17
 */
public class Ej5 {

    public static double millas_a_kilometros(int millas) {

        return millas * 1.60934;
    }

    public static void main(String[] args) {

        int millas;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca las millas a convertir");
        millas = in.nextInt();

        System.out.println("El total de kilometros es de:  " + millas_a_kilometros(millas));

    }

}
