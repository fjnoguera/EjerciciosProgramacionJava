/*3. Escribe un programa que lea una secuencia de números hasta que se introduzca un 
0, y luego muestre cuantos eran positivos y cuantos negativos

 * Proyecto $(project.name} - Archivo Ej3.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */
package ud3.bucles.beta;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 20:45:28
 */
public class Ej3 {

    public static void main(String[] args) {

        int contadorpositivos = 0;
        int contadornegativos = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Te voy pidiendo numeros...");

        System.out.println("Elige un número??... ");

        int P = in.nextInt();

        while (P != 0) {
            System.out.println("Elige un número??... ");
            P = in.nextInt();

            if (P>=0) {

                contadorpositivos = contadorpositivos + 1;
                
            } else if(P<=0) {

                contadornegativos = contadornegativos + 1;
            }

        }
        System.out.println("Total positivos... " + contadorpositivos + "Total negativos..." + contadornegativos);
    }
}


