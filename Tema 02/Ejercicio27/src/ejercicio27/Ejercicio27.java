/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;
import java.util.Scanner;


/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Declaro las variables y el scanner

        int numero;
        int cuadrado;
        int cubo;

        System.out.println("Por favor, introduzca un número:");
        numero = entrada.nextInt();
        //Cálculo de las opreciones
        cuadrado = numero * numero;
        cubo = numero * numero * numero;

        System.out.println("El doble de " + numero + " es: " + cuadrado);
        System.out.println("El cubo de " + numero + " es: " + cubo);
    }
}
    
