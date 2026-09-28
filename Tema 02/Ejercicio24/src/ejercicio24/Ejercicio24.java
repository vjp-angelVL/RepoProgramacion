/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;
import java.util.Scanner;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Declaro el scanner
        //Declaro las variables
        double programacion;
        double lenguajesMarcas;
        double basesDatos;
        double entornosDesarrollo;
        double sistemasInformaticos;
        double fol;
        double media;
        //Imprimo por pantalla las instrucciones para que el usuario las siga
        System.out.println("Por favor, introduzca la nota de Programación:");
        programacion = entrada.nextDouble();

        System.out.println("Introduzca la nota de Lenguajes de Marcas:");
        lenguajesMarcas = entrada.nextDouble();

        System.out.println("Introduzca la nota de Bases de Datos:");
        basesDatos = entrada.nextDouble();

        System.out.println("Introduzca la nota de Entornos de Desarrollo:");
        entornosDesarrollo = entrada.nextDouble();

        System.out.println("Introduzca la nota de Sistemas Informáticos:");
        sistemasInformaticos = entrada.nextDouble();

        System.out.println("Por último, introduzca la nota de Formación y Orientación Laboral:");
        fol = entrada.nextDouble();

        media = (programacion + lenguajesMarcas + basesDatos + entornosDesarrollo + sistemasInformaticos + fol) / 6; //Calculo la media

        System.out.println("Su nota media del curso es de: " + media);
    }
}
    

