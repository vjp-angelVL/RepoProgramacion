/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;
/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int billetes50, billetes20, billetes10, billetes5, monedas2, monedas1, resto, dinero;//Declaro las variables
        Scanner entrada = new Scanner(System.in); //Declaro el scanner
        
        System.out.println("Introduce una cantidad de dinero: ");
        dinero = entrada.nextInt();//Imprimo el mensaje con las instrucciones
        
        billetes50=dinero/50;
        resto=dinero%50;
        
        billetes20=resto/20;
        resto=resto%20;
        
        billetes10=resto/10;
        resto=resto%10;
        
        billetes5=resto/5;
        resto=resto%5;
        
        monedas2=resto/2;
        resto=resto%2;
        
        monedas1=resto;
        
        System.out.println(dinero + "euros son " + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10, " + billetes5 + " billetes de 5, " + monedas2 + " monedas de 2 y " + monedas1 + " monedas de 1");
    }   //Imprimo por pantalla el resultado final
    
}
