/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;
import java.util.Scanner;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) { //Declaro las variables
        int numero;
        int x;
        int y;
        int z;
        int w;
        Scanner entrada = new Scanner(System.in); //Declaro el scanner
        
        System.out.println("Por favor, introduca un numero de 4 cifras: "); //Imprimo por pantalla el menesaje con las instrucciones del programa
        numero = entrada.nextInt ();
        
        x = (numero/1000);
        y = (numero/100) % 10;
        z = (numero/10) % 10;
        w = (numero % 10);
        
        System.out.println("La primera cifra es: " + x);
        System.out.println("La segunda cifra es: " + y);
        System.out.println("La tercera cifra es: " + z);
        System.out.println("La cuarta cifra es: " + w);
        }  
}
    

