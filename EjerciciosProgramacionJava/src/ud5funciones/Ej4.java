/* 4 .- Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
positivo, negativo o cero. Implementa y utiliza la función:
int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
 * Proyecto $(project.name} - Archivo Ej4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */

package ud5funciones;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 17 nov. 2021 21:40:07
 */
public class Ej4 {
    
    
    public static int dimeSigno(int a) {
        if (a < 0) {
            return -1;
        }
        
        else if ( a==0) {
            return 0;
        }
        
        else 
            return 1;
        }
    

    public static void main(String[] args) {

        int a;
        Scanner in = new Scanner(System.in);

        System.out.println("Dime número a");
        a = in.nextInt();
        

        System.out.println("El número es " + dimeSigno(a));

    }
}
        
    
    
    
    
    
    

