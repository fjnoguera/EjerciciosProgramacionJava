/*2.- Escribe un programa que calcule y muestre la suma y el producto (multiplicación) de 
los 10 primeros números naturales.

 * Proyecto $(project.name} - Archivo Ej2.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */

package ud3.bucles.beta;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:23:26
 */
public class Ej2 {
    
     public static void main(String[] args) {

        int contadormult = 1, contadorsuma=0, total = 0;

       
        for (int i = 1; contadormult <= 10; contadormult++) {
            total = contadormult * i;
            System.out.println(i + "*" + contadormult + "= " + total);
        }
     
     
        for (int i= 1; contadorsuma <=10; contadorsuma++) {
            total = contadorsuma + i;
            System.out.println(i + "+" +contadorsuma + "= " + total);
            
     }
        

    }
// Iris dice que lo que quiere resultado de ir acumulando. No he mirado la soluciones y no se exactamente. Hay que ver la solucion

}
