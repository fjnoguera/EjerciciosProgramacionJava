/*11.-Realiza   un   programa   que   escriba   la   tabla   de   multiplicar   de   un   número   introducido   por
teclado. Para ello implementa una función que reciba como parámetro un número entero
y muestre por pantalla la tabla de multiplicar de dicho número.

 * Proyecto $(project.name} - Archivo Ej11.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */

package ud5funciones;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 20:31:43
 */
public class Ej11 {
    
 public static void producto(int n) {
        int producto = 1;
        for (int i = 1; i <= 10; i++) {
            producto = n * i;
            System.out.println(n + " * " + i + " = " + producto);
        
        }
       

 }
    public static void main(String[] args) {        
        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Dime número");
        n = in.nextInt();  
        
        System.out.println("TABLA DEL " + n);
        producto(n);
              
    }
        
    
        
}
