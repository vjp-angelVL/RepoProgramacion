 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numAleatorio = (int)(Math.random()* 100) + 1;
        Scanner entrada = new Scanner(System.in);
        int intentos++;
        do {
        System.out.println("Introduzca el número que crea que es");
        int numUsuario = entrada.nextInt();
        
            if (numUsuario < numAleatorio)
                System.out.println("El número  introducido es menor");
            else if (numUsuario > numAleatorio)
                System.out.println("El número introducido es mayor");
            else {System.out.println("Enhorabuena, "+ numUsuario + " era el correcto");
                System.out.println("Número de intentos: "+ intentos);
                    

                }
        } while (numUsuario != numAleatorio);
        entrada.close();
    }
}
