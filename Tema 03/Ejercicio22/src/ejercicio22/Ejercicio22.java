/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;
import java.util.Scanner; //Importo el scanner
import java.util.InputMismatchException; //Importo la excepción

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
            System.out.print("Introduzca el primer numero: "); //Almaceno el primer número
            int num1 = entrada.nextInt();

            System.out.print("Introduzca el segundo numero: "); //Almaceno el segundo número
            int num2 = entrada.nextInt();

            int suma = num1 + num2; //Suma

            System.out.println("La suma es: " + suma);
        //Para que el usuario no escriba una letra
        } catch (InputMismatchException e)  {
            System.out.println("Error: debe introducir numeros enteros.");
        }
    }
}

    

