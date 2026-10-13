/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numAleatorio = (int)(Math.random()*100) + 1;
        System.out.println("El número aleatorio es: " + numAleatorio);
        
        if (numAleatorio % 2 == 0){
            System.out.println(numAleatorio + " es par.");
        }
        else {
            System.out.println(numAleatorio +" es impar.");
        }
    
    
            
    }
    
}
