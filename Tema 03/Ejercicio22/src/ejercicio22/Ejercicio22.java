/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Introduzca el primer numero: ");
            int num1 = entrada.nextInt();

            System.out.print("Introduzca el segundo numero: ");
            int num2 = entrada.nextInt();

            int suma = num1 + num2;

            System.out.println("La suma es: " + suma);

        } catch (InputMismatchException e) {
            System.out.println("Error: debe introducir numeros enteros.");
        }
    }
}

    

