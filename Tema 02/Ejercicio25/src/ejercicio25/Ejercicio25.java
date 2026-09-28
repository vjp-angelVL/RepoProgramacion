/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;
import java.util.Scanner;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio25{

    /**
     * @param args the command line arguments
     */




    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Declaro el scanner
        //Declaro las variables
        double numero1;
        double numero2;
        double numero3;
        double suma;
        double producto;

        System.out.println("Por favor, introduzca el primer número:");
        numero1 = entrada.nextDouble();

        System.out.println("Por favor, introduzca el segundo número:");
        numero2 = entrada.nextDouble();

        System.out.println("Por favor, introduzca el tercer número:");
        numero3 = entrada.nextDouble();
        //Calculo de las operaaciones
        suma = numero1 + numero2 + numero3;
        producto = numero1 * numero2 * numero3;

        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("El producto de los números introducidos es: " + producto);
    }
}
    

