/* En el centro de salud de tu pueblo necesitan un programa informático de
diagnóstico de riesgo cardiovascular de los pacientes. El riesgo
cardiovascular se representa con un valor numérico y se calcula de la
siguiente manera:
1. Se evalúa qué factores de riesgo tiene o no tiene el paciente.
2. Por estadística todos los pacientes parten de un 5 de riesgo inicial.
3. Cada factor presente aumenta el riesgo inicial en una cantidad fija según
de qué factor se trate.
4. El número de factores presentes tiene un efecto multiplicador sobre el
riesgo inicial. El resultado de la multiplicación es el riesgo final.
Los factores de riesgo y su efecto son:
• Presión arterial alta: +15
• Colesterol elevado: +15
• Diabetes: +10
• Obesidad: +10
• Tabaquismo: +10
• Inactividad física: +10
• Sexo masculino: +5
• Familiares con enfermedades del corazón: +5
• Edad superior a 55 años: +5
El efecto multiplicador según el número de factores de riesgo:
• 2 factores: x1.25
• 3-4 factores: x1.5
• 5-6 factores: x1.75
• 7-8 factores: x2
• 9 factores: x2.5
Haz un programa que pida por teclado los datos necesarios (supondremos
que el usuario introduce valores válidos) y muestre por pantalla el riesgo
inicial, el efecto multiplicador y el riesgo final.
 */
package tareaentregable;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Entregable1 {

    public static void main(String[] args) {

        int p = 5;
        int p1 = 0;
        int c1 = 0;
        int d1 = 0;
        int o1 = 0;
        int t1 = 0;
        int i1 = 0;
        int s1 = 0;
        int f1 = 0;
        int e1 = 0;
        int contador = 0;

        System.out.println(".....INICIANDO TEST DE EVALUACION....");
        System.out.println("Responda a las siguiente preguntas");

        // INICIO TOMA DATOS PRESION// 
        System.out.println("Presión arterial del paciente elevada.... (s/n )?");

        {
            Scanner in = new Scanner(System.in);

            char c = in.next().charAt(0);

            if (c == 's') {

                p1 = p + 15;
                contador = contador + 1;
            } else {
                p1 = p;
            }
        }

        // FIN TOMA DATOS PRESION //
        // INICIO TOMA DATOS COLESTEROL //
        {
            System.out.println("Colesterol  del paciente elevado.... (s/n )?");

            Scanner in = new Scanner(System.in);

            char c = in.next().charAt(0);

            if (c == 's') {

                c1 = 15;
                contador = contador + 1;

            } else {
                c1 = c1;
            }
        }

        // FIN TOMA DATOS COLESTEROL //
        // INICIO TOMA DATOS DIABETES //
        {
            System.out.println("Padece diabetes.... (s/n )?");

            Scanner in = new Scanner(System.in);

            char c = in.next().charAt(0);

            if (c == 's') {

                d1 = 10;
                contador = contador + 1;
            } else {
                d1 = d1;
            }
        }
        // FIN TOMA DATOS DIABETES //
        // INICIO TOMA DATOS OBESIDAD //
        {
            System.out.println("Padece obesidad.... (s/n )?");

            Scanner in = new Scanner(System.in);

            char c = in.next().charAt(0);

            if (c == 's') {

                o1 = 10;
                contador = contador + 1;
            } else {
                o1 = o1;
            }
        }
        // FIN TOMA DATOS OBESIDAD //
        // INICIO TOMA DATOS TABAQUISMO //
        {
            System.out.println("Fumador habitual.... (s/n )?");

            Scanner in = new Scanner(System.in);

            char c = in.next().charAt(0);

            if (c == 's') {

                t1 = 10;
                contador = contador + 1;
            } else {
                t1 = t1;
            }
        }

        // FIN TOMA DATOS TABAQUISMO //
        // INICIO TOMA DATOS INACTIVIDAD FISICA //
        {
            System.out.println("Inactividad física... (s/n )?");

            Scanner in = new Scanner(System.in);

            char c = in.next().charAt(0);

            if (c == 's') {

                i1 = 10;
                contador = contador + 1;
            } else {
                i1 = i1;
            }
        }
        // FIN TOMA DATOS INACTIVIDAD FISICA //
        // INICIO TOMA DATOS SEXO MASCULINO //
        {
            System.out.println("Sexo masculino (s/n )?");

            Scanner in = new Scanner(System.in);

            char c = in.next().charAt(0);

            if (c == 's') {

                s1 = 5;
                contador = contador + 1;
            } else {
                s1 = s1;
            }
        }
        // FIN TOMA DATOS SEXO MASCULINO //
        // INICIO TOMA DATOS FAMILIARES CON ENFERMEDADES CARDIACAS//
        {
            System.out.println("Familiares con enfermedades cardiacas (s/n )?");

            Scanner in = new Scanner(System.in);

            char c = in.next().charAt(0);

            if (c == 's') {

                f1 = 5;
                contador = contador + 1;
            } else {
                f1 = s1;
            }
        }
        // FIN TOMA DATOS FAMILIARES CON ENFERMEDADES CARDIACAS //
        // INICIO TOMA DATOS EDAD SUPERIOR A 55 AÑOS//
        {
            System.out.println("Edad superior a 55 años (s/n )?");

            Scanner in = new Scanner(System.in);

            char c = in.next().charAt(0);

            if (c == 's') {

                e1 = 5;
                contador = contador + 1;
            } else {
                e1 = e1;
            }

        }

        if (contador < 2) {
            int suma = p1 + c1 + d1 + o1 + t1 + i1 + s1 + f1 + e1;

            System.out.println("Riesgo inicial (genérico)................" + p);
            System.out.println("Total puntos obtenidos tras el test..... " + suma);
            System.out.println("Total factores .........................." + contador);
        } else if (contador == 2) {

            double suma = (p1 + c1 + d1 + o1 + t1 + i1 + s1 + f1 + e1) * 1.2;

            System.out.println("Riesgo inicial (genérico)................" + p);
            System.out.println("Total puntos obtenidos tras el test..... " + suma);
            System.out.println("Total factores .........................." + contador);

        } else if (contador <= 4) {

            double suma = (p1 + c1 + d1 + o1 + t1 + i1 + s1 + f1 + e1) * 1.5;

            System.out.println("Riesgo inicial (genérico)................" + p);
            System.out.println("Total puntos obtenidos tras el test..... " + suma);
            System.out.println("Total factores .........................." + contador);
        } else if (contador <= 6) {

            double suma = (p1 + c1 + d1 + o1 + t1 + i1 + s1 + f1 + e1) * 1.75;

            System.out.println("Riesgo inicial (genérico)................" + p);
            System.out.println("Total puntos obtenidos tras el test..... " + suma);
            System.out.println("Total factores .........................." + contador);
        } else if (contador <= 8) {

            double suma = (p1 + c1 + d1 + o1 + t1 + i1 + s1 + f1 + e1) * 2;

            System.out.println("Riesgo inicial (genérico)................" + p);
            System.out.println("Total puntos obtenidos tras el test..... " + suma);
            System.out.println("Total factores .........................." + contador);
        } else {

            double suma = (p1 + c1 + d1 + o1 + t1 + i1 + s1 + f1 + e1) * 2.5;

            System.out.println("Riesgo inicial (genérico)................" + p);
            System.out.println("Total puntos obtenidos tras el test..... " + suma);
            System.out.println("Total factores .........................." + contador);

        }

    }
}
