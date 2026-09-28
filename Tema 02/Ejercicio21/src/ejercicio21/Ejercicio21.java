/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author alumno
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int segundos = 0; //Establezco los segundos a 0
        
        try {
            
        
            System.out.println("Por favor, introduzca un número de segundos"); //Mensaje que indica al usuario lo que tiene que hacer
            segundos = entrada.nextInt();
            //Cálculos de los tiempos
            int dias = segundos/86400;
            segundos = segundos % 86400;

            int horas = segundos/3600;
            segundos = segundos % 3600;

            int minutos = segundos/60;
            segundos = segundos % 60;

            System.out.println(segundos + " segundos hacen un total de " + dias + " días " + horas + " horas" + minutos + " minutos y " + segundos + " segundos");
            
        }
        //Para evitar que el programa se ejecute si el usuario mete algo que no sea un número entero
        catch (InputMismatchException e) {
            System.out.println("Introduzca un número entero");
        }
               
    }
    
}
