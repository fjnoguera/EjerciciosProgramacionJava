/* 1.- Escribe un programa que muestre la tabla de multiplicar del número que indique el 
usuario
 * Proyecto $(project.name} - Archivo Ej1.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */
package ud3.bucles.beta;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 19:53:52
 */
public class Ej1 {

    public static void main(String[] args) {

        int contador = 1, total = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Que tabla de multiplicar desea.. introduzca número:.....");

        int A = in.nextInt();
        for (int i = A; contador <= 10; contador++) {
            total = contador * i;
            System.out.println(A + "*" + contador + "= " + total);
        }

    }

}


