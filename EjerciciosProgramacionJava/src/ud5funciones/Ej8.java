/*8. Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N,
el   productorio   de   1   a   N   y   el   valor   intermedio   entre   1   y   N.   Implementa   y   utiliza   las
funciones:
int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
 * Proyecto $(project.name} - Archivo Ej8.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */
package ud5funciones;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 19:26:22
 */
public class Ej8 {

    public static int suma1aN(int n) {
        int sumatorio = 0;
        for (int i = 1; i <= n; i++) {
            sumatorio = sumatorio + i;
        }
        return sumatorio;

    }

    public static int producto1aN(int n) {
        int productorio = 1;
        for (int i = 1; i <= n; i++) {
            productorio = productorio * i;
        }
        return productorio;
    }

    public static double intermedio1aN(int n) {

        return (double) (n+1)/2;

    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Dime un número ");
        n = in.nextInt();

        System.out.println("El sumatorio es " + suma1aN(n));
        System.out.println("El productorio es  " + producto1aN(n));
        System.out.println("El intermedio es   " + intermedio1aN(n));

    }

}
