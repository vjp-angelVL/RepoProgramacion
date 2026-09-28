/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Declaro las diferentes variables
        int dineroTotal = 130;
        int billetesCincuenta = dineroTotal/50; 
        int billetesDiez = (dineroTotal%50)/10; //Para dividir entre 10 el resto de 50
        //Imprimo por pantalla del mensaje
        System.out.println("130 euros hacen un total de: " + billetesCincuenta + " billetes de 50 euros y " + billetesDiez + " billetes de 10 euros");
             
    }
    
}
