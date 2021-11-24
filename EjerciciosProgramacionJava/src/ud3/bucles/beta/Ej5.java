/*5.-Escribe un programa que sume independientemente los pares y los impares de los 
números comprendidos entre A y B (valores que introduce el usuario), y luego 
muestre por pantalla ambas sumas
 * Proyecto $(project.name} - Archivo Ej5.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */

package ud3.bucles.beta;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:34:20
 */
public class Ej5 {
     public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca dos números enteros... ");

        int A = in.nextInt();
        int B = in.nextInt();
        int sumapares=0;
        int sumaimpares=0;

        for (int i = A; i <= B; i++) {

            if (i % 2 == 0) {
                System.out.println("Los números son:   " + i);
                
             sumapares = sumapares +i;

            }
            else {
             sumaimpares = sumaimpares +i 
                     
                System.out.println("Los numeros impares son "+ i );
               
        }
            }
           
           System.out.println("La suma de los pares es:" + sumapares +"los impares son:" + sumaimpares);
           
        }

            
            
    
    

}
