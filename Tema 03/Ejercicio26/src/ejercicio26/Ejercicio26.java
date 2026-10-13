/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

/**
 *
 * @author Ángel Vegas 
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 111; i <= 222; i = i + 2) { //Para que escoja solo los impares
            suma = suma + i; //Calculo de la suma de los impares
        }

        System.out.println("La suma de los numeros impares entre 111 y 222 es: " + suma); //imprimo la suma por pantalla
    }
}

    

