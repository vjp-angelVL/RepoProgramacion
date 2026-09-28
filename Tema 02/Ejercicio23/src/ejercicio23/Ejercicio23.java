/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
import java.util.Scanner;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Declaro el scanner

        double precio; //Declaro las variables
        int unidades;
        double total;

        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar:"); //aquí se esteblece el primer valor
        precio = entrada.nextDouble();

        System.out.println("¿Cuántas unidades quiere llevarse?"); //Aquí se esteblece el segundo valor
        unidades = entrada.nextInt();

        total = precio * unidades; //total = producto de ambos valores
        

        System.out.println("El precio total de su compra es de: " + total + " Euros.");
    }
}


   
