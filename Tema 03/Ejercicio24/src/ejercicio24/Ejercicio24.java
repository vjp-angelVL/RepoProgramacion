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
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduzca un numero mayor que 0: ");
            numero = entrada.nextInt();

            if (numero <= 0) {
                System.out.println("Error: el numero debe ser mayor que 0.");
            }

        } while (numero <= 0);

        int contador = 3;
        int cantidad = 0;

        System.out.println("Los multiplos de 3 son:");

        while (contador <= numero) {
            System.out.println(contador);
            cantidad++;
            contador = contador + 3;
        }

        System.out.println("Total de numeros mostrados: " + cantidad);
    }
}

    

