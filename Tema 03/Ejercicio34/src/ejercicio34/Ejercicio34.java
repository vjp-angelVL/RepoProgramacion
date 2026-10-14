/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio34;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Declaro el scanner
        //Declaro las variables
        int diaSalida;
        int horaSalida;
        int minutoSalida;

        int diaLlegada;
        int horaLlegada;
        int minutoLlegada;

        int minutosSalida;
        int minutosLlegada;
        int duracion;
        int horas;
        int minutos;
        //Pido los datos al usuario y los almaceno
        System.out.println("Introduce el dia de salida:");
        diaSalida = entrada.nextInt();

        System.out.println("Introduce la hora de salida:");
        horaSalida = entrada.nextInt();

        System.out.println("Introduce el minuto de salida:");
        minutoSalida = entrada.nextInt();

        System.out.println("Introduce el dia de llegada:");
        diaLlegada = entrada.nextInt();

        System.out.println("Introduce la hora de llegada:");
        horaLlegada = entrada.nextInt();

        System.out.println("Introduce el minuto de llegada:");
        minutoLlegada = entrada.nextInt();
        //Establezco los requisitos para que el programa funciones correctamente
        if (diaSalida < 1 || diaLlegada < 1
                || horaSalida < 0 || horaSalida > 23
                || horaLlegada < 0 || horaLlegada > 23
                || minutoSalida < 0 || minutoSalida > 59
                || minutoLlegada < 0 || minutoLlegada > 59) {

            System.out.println("Error: la fecha u hora no es valida.");

        } else {
            //Paso toda la información a minutos para proceder a su cálculo
            minutosSalida = (diaSalida * 24 * 60)
                    + (horaSalida * 60) + minutoSalida;

            minutosLlegada = (diaLlegada * 24 * 60)
                    + (horaLlegada * 60) + minutoLlegada;
            //Establezco el último requisito para que el programa se ejecute correctamente
            if (minutosLlegada < minutosSalida) {

                System.out.println("Error: la llegada no puede ser anterior a la salida.");

            } else {
                
                
                //Vuelvo a pasar la información a los datos iniciales y posteriormente imprimo por pantalla la duración del viaje
                duracion = minutosLlegada - minutosSalida;

                horas = duracion / 60;
                minutos = duracion % 60;

                System.out.println("El tren tarda " + horas
                        + " horas y " + minutos + " minutos.");
            }
        }
    }
}

    

