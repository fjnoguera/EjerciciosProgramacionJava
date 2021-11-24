/*7.Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su
área y su perímetro. Implementa y utiliza las funciones:
double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
double areaRectangulo(double ancho, double alto) // Devuelve el área


 * Proyecto $(project.name} - Archivo Ej7.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */
package ud5funciones;

import java.util.Scanner;


/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 18 nov. 2021 19:10:25
 */
public class Ej7 {

    public static double perimetroRectangulo(double ancho, double alto) {

        return (ancho * 2) + (alto * 2);

    }

    public static double areaRectangulo(double ancho, double alto) {

        return ancho * alto;
    }

    public static void main(String[] args) {

        double ancho, alto;
        Scanner in = new Scanner(System.in);

        System.out.println("Dime el ancho");
        ancho = in.nextInt();

        System.out.println("Dime el alto ");
        alto = in.nextInt();

        System.out.println("El perimetro es " + perimetroRectangulo(ancho, alto));
        System.out.println("El area es " + areaRectangulo(ancho, alto));

    }

}


