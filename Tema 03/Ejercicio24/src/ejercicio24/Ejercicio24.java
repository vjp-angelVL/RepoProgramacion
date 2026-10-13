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
            numero = entrada.nextInt(); //Almaceno el número

            if (numero <= 0) {
                System.out.println("Error: el numero debe ser mayor que 0."); //Para que el número sea superior a 0
            }

        } while (numero <= 0);

        int contador = 3; //Para que cuente cada 3 números
        int cantidad = 0; //Establezco el contador a 0

        System.out.println("Los multiplos de 3 son:"); //Para imprimir cada 3 números

        while (contador <= numero) { //Para que se repita hasta que llegue al número introducido
            System.out.println(contador);
            cantidad++;
            contador = contador + 3; //Para que se vayan sumando al número anterior
        }

        System.out.println("Total de numeros mostrados: " + cantidad); //Mostrará el número de números impresos
    }
}

    

