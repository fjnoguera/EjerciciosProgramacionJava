/*import java.util.Scanner;

 * Proyecto $(project.name} - Archivo Calculadora.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */
package CasoPractico0Calculadora;

import java.util.Scanner;

public class Calculadora {

    /**
     *
     * @author Javier Noguera Giménez<dawjavi@gmail.com>
     * @version 1.0
     * @date 24 nov. 2021 16:44:52
     */
//Muestra el menú, pide al usuario valor rango 1-9 y devuelve la opción elegida.
    public static int menu() {

        System.out.println("1. Suma (A + B)\n"
                + "2. Resta (A - B)\n"
                + "3. Multiplicación (A * B)\n"
                + "4. División (A / B)\n"
                + "5. Área de un rectángulo (Base x Altura)\n"
                + "6. Área de un triángulo equilátero (Base x Altura / 2)\n"
                + "7. Área de un círculo (Pi x R²)\n"
                + "8. Seno, Coseno y Tangente (de X)\n"
                + "9. Salir.");

        int opcion = pedirIntEnRango(1,9);
        return opcion;
    }

// Realiza la operación del menú indicada en 'int opcion' (1 sumar, 2 restar, etc.)
    public static void realizaOperacion(int opcion) {

    }

// Pide al usuario un valor int, una y otra vez hasta que responde con valor en rango, devuelve el valor
    public static int pedirIntEnRango(int min, int max) {

        Scanner in = new Scanner(System.in);
        int valor;

        do {


        } 
        return;
    }

// Pide A y B, calcula la suma y la muestra
    public static void suma(int a, int b) {

    }

// Pide A y B, calcula la resta y la muestra
    public static void resta(int a, int b) {
    }

// Pide A y B, calcula la mult y la muestra
    public static void mult(int a, int b) {
    }

// Pide A y B, calcula la div y la muestra
    public static void div(int a, int b) {
    }

// Pide Base y Altura en rango 0-1Millon, calcula area rectangulo y lo muestra
    public static void areaRectangulo(int a, int b) {
    }

// Pide Base y Altura en rango 0-1Millon, calcula area triangulo y lo muestra
    public static void areaTrinagulo(int a, int b) {
    }

// Pide Radio en rango 0-1Millon, calcula area ciculo y lo muestra
    public static void areaCiculo() {
    }

// Pide X en rango -360 a 360, calcula y muestra Sin, Cos y Tan de X
    public static void calculaSinCosTan() {
    }

    public static void main(String[] args)
    int opcion;

    
        do {
            opcion = muestraMenu();
        realizaOperacion(opcion);
        System.out.println("");
    }
    while (opcion != 9);
}

