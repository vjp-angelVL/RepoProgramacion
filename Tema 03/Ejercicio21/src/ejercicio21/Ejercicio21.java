/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner; //Importo el scanner

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca el primer numero: "); //Recojo el primer número
        int num1 = entrada.nextInt();

        System.out.print("Introduzca el segundo numero: "); //Recojo el segundo número
        int num2 = entrada.nextInt();

        try {
            int resultado = num1 / num2;
            System.out.println("El resultado de la division es: " + resultado); //División
        } catch (ArithmeticException e) { //Para evitar que el usuario escriba una letra
            System.out.println("Error: no se puede dividir entre cero.");
        }
    }
}

