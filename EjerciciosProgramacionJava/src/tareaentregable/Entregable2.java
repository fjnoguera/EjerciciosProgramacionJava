
/* Hacer un programa que permita al usuario realizar diferentes
operaciones matemáticas con números decimales. Se mostrará por
pantalla un menú con las siguientes opciones:
1. Sumar A+B
2. Restar A-B
3. Multiplicar A*B
4. Dividir A/B
5. Resto A%B
6. Exponencial A^B
7. Seno(X)
8. Coseno(X)
9. Tangente(X)
10. Salir
El usuario elegirá una opción del 1 al 10. El programa pedirá los valores
necesarios según la opción elegida y mostrará el resultado de la operación
matemática. Supondremos que el usuario introduce valores válidos.
 */
package tareaentregable;

/**
 *
 * @author Javier
 *
 */
import java.util.Scanner;
import java.lang.Math;

public class Entregable2 {

    public static void main(String[] args) {
        int opcion;
        System.out.println("Introduzca dos números :");
        Scanner in = new Scanner(System.in);
        int num1, num2;
        num1 = in.nextInt();
        num2 = in.nextInt();
        
        System.out.println("Elija una opcion:...");
        System.out.println("1.- Suma");
        System.out.println ("2. -Resta");
        System.out.println ("3. -Multiplicacion");
        System.out.println ("4. -Division");
        System.out.println ("5. -Resto");
        System.out.println ("6. -Exponencial");
        System.out.println ("7. -Seno (repita el ángulo 2 veces");
        System.out.println ("8. -Coseno (repita el ángulo 2 veces");
        System.out.println ("9. -Tangente (repita el ángulo 2 veces");
        System.out.println ("10.-Salir");
          
        
        opcion = in.nextInt();
        switch (opcion) {
            
            case 1:
                double suma = num1 +num2;
                System.out.println("La suma es:........." + suma);
                break;
                
            case 2:
                double resta = num1 - num2;
                System.out.println("La resta es:........"+ resta);
                break;
                
            case 3:
                double multiplicacion = num1 * num2;
                System.out.println("La multiplicación es:....."+ multiplicacion);
                break;
                
            case 4:
                double division = num1 / num2;
                System.out.println("La division es:.........." + division);
                break;
                
            case 5:
                double resto = num1 % num2;
                System.out.println("El resto es:............. "+ resto);
                break;
                
            case 6:
                double exponencial = Math.pow(num1,num2);
                System.out.println("El resultado es:..........."+ exponencial);       
                break;
            
            case 7:
                double seno = Math.sin(num1);
                 System.out.println("El seno de " +num1 + "  es:.." + seno);
                 break;
              
             
            case 8:
                 double coseno = Math.cos(num1);
                 System.out.println("El coseno de " +num1 + "  es:.." + coseno);
                 break;
                
            case 9:               
                double tangente = Math.tan(num1);
                System.out.println("El coseno de " +num1 + "  es:.." + tangente);
                break;
                
            case 10:
                
                break;
              
            default:
                
                System.out.println("Opción incorrecta");
                

        }

    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    public static int mult(int x, int y) {
        int result = x * y;
        return result;
    }

    public static int div(int x, int y) {
        int result = x / y;
        return result;
    }

}


