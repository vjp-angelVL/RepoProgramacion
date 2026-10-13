/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
import java.util.Scanner; //Importo el scanner
/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduzca un numero mayor que 1: ");
            numero = entrada.nextInt(); //Almaceno el número
            //Para que el número sea mayor que 1
            if (numero <= 1) {
                System.out.println("Error: el numero debe ser mayor que 1.");
            }

        } while (numero <= 1);

        int contador = 1;

        while (contador <= numero) { // Para immprimir la cantidad de números que hay entre ambos
            System.out.println(contador);
            contador++;
        }
    }
}

    

