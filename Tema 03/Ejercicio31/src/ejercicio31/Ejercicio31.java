/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Declaro las variables
        int numero;
        int contador = 0;
        int impares = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        while (impares < 3) {
            //Genero los números aleatorios
            numero = (int) (Math.random() * 100) + 1;
            contador++;
            //Si el número es impar, los almaceno
            if (numero % 2 != 0) {
                impares++;

                switch (impares) {
                    case 1 -> num1 = numero;
                    case 2 -> num2 = numero;
                    default -> num3 = numero;
                }
            }
        }
        //Imprimo por pantalla los números impares
        System.out.println("Los tres números impares son: "
                + num1 + " - " + num2 + " - " + num3);
        //Imprimo por pantalla la cantidad de números generados
        System.out.println("Cantidad de números generados: " + contador);
    }
}

    

