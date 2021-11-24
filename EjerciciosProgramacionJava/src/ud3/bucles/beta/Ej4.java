/*4.-Escribe un programa que lea una secuencia de notas (valores enteros de 0 a 10) 
hasta que el usuario introduzca un -1, y luego muestre la suma total, la media y si 
alguna nota fué un 10. 

 * Proyecto $(project.name} - Archivo Ej4.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */

package ud3.bucles.beta;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:07:52
 */
public class Ej4 {
     public static void main(String[] args) {

        int contador= 0;
        int sumatotal=0;
        int media=0;
        int contadordedieces = 0;
        

        Scanner in = new Scanner(System.in);

        System.out.println("Te voy a pedir las notas ...(-1=Salir)");

        System.out.println("Introduzca la primera nota ... ");

        int nota = in.nextInt();

        while (nota != -1) {
            
           sumatotal=sumatotal+nota;
           contador=contador+1;
           
            if (nota==10) {

                contadordedieces = contadordedieces + 1;
                
           }
           
            System.out.println("Introduzca la siguiente nota.. ");
             nota = in.nextInt();
             


        }
        
        
        media = sumatotal/contador;
        System.out.println("La suma total de notas es:  " + sumatotal + " Su media es " + media + " y tiene " + contadordedieces +" dieces");
        
    }
}

