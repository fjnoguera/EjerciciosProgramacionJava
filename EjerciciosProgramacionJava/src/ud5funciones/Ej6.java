/* 6.- Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de
cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA

 * Proyecto $(project.name} - Archivo Ej6.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */
package ud5funciones;

import java.util.Scanner;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 18:12:55
 */
public class Ej6 {

   public static double precioConIVA(double precio) {

        return precio * 1.21;
    }

    public static void main(String[] args) {

        double precio;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {

            System.out.println("Introduzca el precio " + i);
            precio = in.nextDouble();
            System.out.println("El precio " +i +" del producto con Iva es de :  " + precioConIVA(precio));

        }

    }

}
