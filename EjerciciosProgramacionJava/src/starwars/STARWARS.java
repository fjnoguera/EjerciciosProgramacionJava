/*
 * Proyecto $(project.name} - Archivo STARWARS.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0
 */
package starwars;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Javier Noguera Giménez<dawjavi@gmail.com>
 * @version 1.0
 * @date 28 oct. 2021 20:06:58
 */
public class STARWARS {

    /**
     * @param args the command line arguments// NIVEL 2: ENUNCIADO Y CAPTURA DE
     * RESPUESTA // ]// RECICLO EL ESCANER DEL METODO 1 // Scanner in = new
     * Scanner(System.in);
     *
     * System.out.println("Gracias a Chewbacca consiguen llegar al sistema
     * correcto y ven a\n" + "lo lejos la estrella de la muerte. Como van en una
     * nave imperial\n" + "robada se aproximan lentamente con la intención de
     * pasar\n" + "desapercibidos. De repente suena el comunicador. “Aquí
     * agente\n" + "de espaciopuerto" + P1 + "contactando con nave imperial" +
     * P2 + ". No están\n" + "destinados en este sector. ¿Qué hacen aquí?”. Han
     * Solo coge el\n" + "comunicador e improvisa. “Eh… tenemos un fallo en el…
     * eh…\n" + "condensador de fluzo... Solicitamos permiso para atracar y\n" +
     * "reparar la nave”. El agente, que no se anda con tonterías,\n" +
     * "responde “Proporcione código de acceso o abriremos fuego”. Han\n" +
     * "Solo ojea rápidamente el manual del piloto que estaba en la\n" +
     * "guantera y da con la página correcta. El código es el productorio\n" +
     * "entre el nº del agente y el nº de la nave (ambos inclusive).\n" + "¿Cuál
     * es el código?"); System.out.println("Respuesta2 = " + productorio); //
     * NIVEL 2: CONDICIONAL // int respuesta2 = in.nextInt();
     *
     * if (respuesta2 == productorio) {
     *
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean error = false;

        // INICIO //
        System.out.println("===STAR WARS CÓDIGOS SECRETOS===");
        System.out.println("Hace mucho tiempo, en una galaxia muy, muy lejana...La Princesa\n "
                + "Leia, Luke Skywalker, Han Solo, Chewbacca, C3P0 Y R2D2 viajan \n "
                + "en una nave imperial robada en una misión secreta para infiltrarse \n"
                + " en otra estrella de la muerte que el imperio está contruyendo\n"
                + " para destruirla. (Presiona Intro para continuar)");
        String esperar = in.nextLine();

        // NIVEL 1: DECLARACION DE VARIABLES//
        int S1 = (int) (Math.random() * 10 + 1);
        int S2 = (int) (Math.random() * 30 + 20);
        int sumatorio = 0;

        // NIVEL 1:  BUCLE COMPROBACION SUMATORIO //         
        for (int i = S1; i <= S2; i++) {
            sumatorio = sumatorio + i;

        }

        // NIVEL 1: ENUNCIADO //
        System.out.println(" Los problemas empiezan cuando deben realizar un salto\n "
                + "hiperespacial hasta el sistema estelar " + S1 + " en el sector " + S2 + ",pero el\n "
                + "control de navegación está estropeado y el computador tiene \n "
                + "problemas para calcular parte de las coordenadas de salto.\n Chewbacca, piloto experto, se  da cuenta que falta el cuarto\n"
                + " número de la serie. Recuerda de sus tiempos en la academia de\n "
                + "pilotos que para calcularlo hay que calcular el sumatorio entre el\n"
                + " nº del sistema y el nº del sector (ambos inclusive). ¿Que debe \n introducir?.");
       // System.out.println("Respuesta = " + sumatorio);

        // NIVEL 1: CONDICIONAL //
        int respuesta = in.nextInt();

        if (respuesta == sumatorio) {
            System.out.println("Correcto -> Pasas al nivel 2");

            // NIVEL 2: DECLARACION DE VARIABLES  // 
            int P1 = (int) (1 + Math.random() * 7);
            int P2 = (int) (8 + Math.random() * (12 - 8 + 1));
            int productorio = 1;
            // NIVEL 2: ENUNCIADO //

            System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a\n"
                    + "lo lejos la estrella de la muerte. Como van en una nave imperial\n"
                    + "robada se aproximan lentamente con la intención de pasar\n"
                    + "desapercibidos. De repente suena el comunicador. “Aquí agente\n"
                    + "de espaciopuerto" + P1 + "contactando con nave imperial" + P2 + ". No están\n"
                    + "destinados en este sector. ¿Qué hacen aquí?”. Han Solo coge el\n"
                    + "comunicador e improvisa. “Eh… tenemos un fallo en el… eh…\n"
                    + "condensador de fluzo... Solicitamos permiso para atracar y\n"
                    + "reparar la nave”. El agente, que no se anda con tonterías,\n"
                    + "responde “Proporcione código de acceso o abriremos fuego”. Han\n"
                    + "Solo ojea rápidamente el manual del piloto que estaba en la\n"
                    + "guantera y da con la página correcta. El código es el productorio\n"
                    + "entre el nº del agente y el nº de la nave (ambos inclusive).\n"
                    + "¿Cuál es el código?");

            // NIVEL 2:  BUCLE COMPROBACION PRODUCTORIO //         
            for (int i = P1; i <= P2; i++) {
                productorio = productorio * i;
            }

           // System.out.println("Respuesta2 = " + productorio);

            // NIVEL 2: CONDICIONAL //
            int respuesta2 = in.nextInt();

            if (respuesta2 == productorio) {

                // NIVEL 3: DECLARACION DE VARIABLES //
                int N = (int) (50 + Math.random() * (100 - 50 + 1));
                int factorial = 1;

                // NIVEL 3: ENUNCIADO //
                System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de\n"
                        + "la muerte, se equipan con trajes de soldados imperiales que\n"
                        + "encuentran en la nave para pasar desapercibidos y bajan. Ahora\n"
                        + "deben averiguar en qué nivel de los" + N + " existentes se encuentra el\n"
                        + "reactor principal. Se dirigen al primer panel computerizado que\n"
                        + "encuentran y la Princesa Leia intenta acceder a los planos de la\n"
                        + "nave pero necesita introducir una clave de acceso. Entonces\n"
                        + "recuerda la información que le proporcionó Lando Calrissian “La\n"
                        + "clave de acceso a los planos de la nave es el factorial de N/10\n"
                        + "(redondeando N hacia abajo), donde N es el nº de niveles”.\n"
                        + "¿Cual es el nivel correcto?");

                //NIVEL 3: BUCLE DE COMPROBACION//          
                N = N / 10;

                for (int i = 1; i <= N; i++) {

                    factorial = factorial * i;
                }

               // System.out.println("Respuesta3 = " + factorial);

                // NIVEL 3: CONDICIONAL //
                int respuesta3 = in.nextInt();

                if (respuesta3 == factorial) {

                    //NIVEL 4: DECLARACION DE VARIABLES //
                    int P = (int) (10 + Math.random() * (100 - 10 + 1));
                    int contador = 0;

                    //NIVEL 4: ENUNCIADO //
                    System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y\n"
                            + "encuentran la puerta acorazada que da al reactor principal. R2D2\n"
                            + "se conecta al panel de acceso para intentar hackear el sistema y\n"
                            + "abrir la puerta. Para desencriptar la clave necesita verificar si el\n"
                            + "número" + P + " es primo o no. Si es primo introduce un 1, si no lo es\n"
                            + "introduce un 0.");

                    //NIVEL 4: BUCLE DE COMPROBACION //
                    for (int i = 1; i <= P; i++) {

                        if ((P % i) == 0) {
                            contador++;
                        }
                    }
                    if (contador <= 2) {

                            P = 1;
                        } else {
                            P = 0;
                        }

                    //NIVEL4: CONDICIONAL //
                    int respuesta4 = in.nextInt();

                    if (respuesta4 == P) {
                        //NIVEL 5: DECLARACION DE VARIABLES //
                        int M = (int) (5 + Math.random() * (10 - 5 + 1));
                        int S = (int) (5 + Math.random() * (10 - 5 + 1));
                        int facM = 1;
                        int facS = 1;
                        //NIVEL 5: ENUNCIADO //
                        System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker\n"
                                + "coloque la bomba, programe el temporizador y salir de allí\n"
                                + "corriendo. Necesita programarlo para que explote en exactamente\n"
                                + +M + " minutos y" + S + "segundos, el tiempo suficiente para escapar antes\n"
                                + "de que explote pero sin que el sistema de seguridad antiexplosivos detecte y desactive la bomba. Pero el temporizador\n"
                                + "utiliza un reloj Zordgiano un tanto peculiar. Para convertir los\n"
                                + "minutos y segundos al sistema Zordgiano hay que sumar el\n"
                                + "factorial de M y el factorial de S. ¿Qué valor debe introducir?");
                        //NIVEL 5: BUCLE DE COMPROBACION//
                        for (int i = 1; i <= M; i++) {

                            facM = facM * i;

                        }
                        for (int i = 1; i <= S; i++) {

                            facS = facS * i;
                        }
                        int facsuma = facM + facS;
                       // System.out.println("Respuesta: " + facsuma);

                        //NIVEL 5: CONDICIONAL//
                        int respuesta5 = in.nextInt();

                        if (respuesta5 == facsuma) {
                            //NIVEL: GANAR//
                            System.out.println("Luke Skywalker introduce el tiempo correcto, activa el\n"
                                    + "temporizador y empiezan a sonar las alarmas. Salen de allí\n"
                                    + "corriendo, no hay tiempo que perder. La nave se convierte en un\n"
                                    + "hervidero de soldados de arriba a abajo y entre el caos que les\n"
                                    + "rodea consiguen llegar a la nave y salir de allí a toda prisa. A\n"
                                    + "medida que se alejan observan por la ventana la imagen de la\n"
                                    + "colosal estrella de la muerte explotando en el silencio del espacio,\n"
                                    + "desapareciendo para siempre junto a los restos del malvado\n"
                                    + "imperio.\n"
                                    + "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas!\n"
                                    + "Enhorabuena ;D\n");
                                    

                        } else {
                            error = true;

                        }

                    } else {
                        error = true;

                    }

                } else {
                    error = true;

                }

            } else {
                error = true;
            }

        } else {
            error = true;

        }

        //NIVEL: PERDER //
        if (error == true) {
            System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :\n"
                    + "(\n"
                    + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a\n"
                    + "intentarlo!");
        }
        System.out.println("Gracias por jugar :D");
    }
}
