/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexamenra01ra02ra03;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Ángel Vegas López
 */
public class EjercicioExamenRA01RA02RA03 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int opcion;
        //Muestro por pantalla el menú de opciones
        do {
            System.out.println("Menú de opciones");
            System.out.println("1. Formar grupos para acceder a una atraccion");
            System.out.println("2. Ordenar los tiempos de espera");
            System.out.println("3. Calcular el area de la superficie del tiovivo");
            System.out.println("4. Salir del programa");

            opcion = pedirOpcion();
            //Abro un swtich para poder ejecutar las opciones
            switch (opcion) {
                //Para la primera opción
                case 1 -> {
                    //Llamo al método que pide el número de visitantes
                    int visitantes = pedirVisitantes();
                    //Llamo al método que forma los grupos
                    formarGrupos(visitantes);
                //Para la segunda opción
                }
                case 2 -> {
                    //Llamo a los métodos que almacenan el tiempo de cada atracción
                    int tiempo1 = pedirTiempo1();
                    int tiempo2 = pedirTiempo2();
                    int tiempo3 = pedirTiempo3();
                    //Llamo al método que ordena de menor a mayor todos los tiempos
                    ordenarTiempos(tiempo1, tiempo2, tiempo3);
                }
                //Para la tercera opción
                case 3 -> {
                    //Llamo a ambos métodos.
                    //Para pedir el radio.
                    double radio = pedirRadio();
                    //Para calcular el área.
                    double area = calcularArea(radio);

                    System.out.println("El area del tiovivo es: " + area);
                }

                case 4 -> System.out.println("Saliendo del programa...");

                default -> System.out.println("Opcion incorrecta. Selecciones una de las opciones del menú");
            }
        //Opción para salir del menú
        } while (opcion != 4);

    }

    //Métodos

    //Método para pedir la opción del menú
    public static int pedirOpcion() {
        Scanner entrada = new Scanner(System.in); //Leo lo que el usuario me escribe
        int opcion;
    
        System.out.print("Introduzca una opcion: ");
    
        opcion = entrada.nextInt();

        return opcion;
    }

    //Método para pedir el número de visitantes

    public static int pedirVisitantes() {
        Scanner entrada = new Scanner(System.in);
        int visitantes;

        do {
            System.out.print("Introduzca el numero de visitantes: ");

            visitantes = entrada.nextInt();

            if (visitantes <= 1) {
                System.out.println("El numero debe ser mayor que 1.");
            }

        } while (visitantes <= 1);

        return visitantes;
    }

    //Método para pedir los tiempos

    public static int pedirTiempo1() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el tiempo de la primera atraccion: ");

        return entrada.nextInt();
    }

    public static int pedirTiempo2() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el tiempo de la segunda atraccion: ");


        return entrada.nextInt();
    }

    public static int pedirTiempo3() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el tiempo de la tercera atraccion: ");


        return entrada.nextInt();
    }

    // Método que pide el radio

    public static double pedirRadio() {
        Scanner entrada = new Scanner(System.in);
        double radio;

        do {
            System.out.print("Introduzca el radio del tiovivo: ");

            radio = entrada.nextDouble();

            if (radio <= 0) {
                System.out.println("El radio debe ser mayor que 0.");
            }

        } while (radio <= 0);

        return radio;
    }

    //Método para formar grupos

    public static void formarGrupos(int visitantes) {

        int divisor = 2;

        while (visitantes % divisor != 0) {
            divisor++;
        }

        System.out.println("El primer divisor mayor que 1 es: " + divisor);
        System.out.println("Se formarán " + divisor + " grupos");
    }

    //Método para ordenar los tiempos

    public static void ordenarTiempos(int tiempo1, int tiempo2, int tiempo3) {

        int t; //Utilizo una variable auxiliar para ayudarme a ordenar los tiempos

        if (tiempo1 > tiempo2) {
            t = tiempo1;
            tiempo1 = tiempo2;
            tiempo2 = t;
        }

        if (tiempo2 > tiempo3) {
            t = tiempo2;
            tiempo2 = tiempo3;
            tiempo3 = t;
        }

        if (tiempo1 > tiempo2) {
            t = tiempo1;
            tiempo1 = tiempo2;
            tiempo2 = t;
        }
        //Aquí se muestra por pantalla los tiempos ordenados
        System.out.println("Los tiempos ordenados son:");
        System.out.println(tiempo1);
        System.out.println(tiempo2);
        System.out.println(tiempo3);
    }

    //Para calcular el área de la superficie del tiovivo

    public static double calcularArea(double radio) {

        double area;

        area = Math.PI * Math.pow(radio, 2);

        return area;
    }

}

                        
