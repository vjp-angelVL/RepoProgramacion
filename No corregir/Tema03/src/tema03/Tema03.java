/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema03;

/**
 *
 * @author alumno
 */
public class Tema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int indice = 0;
        //  WHILE
        System.out.println("WHILE");
        while(indice < 10){
            System.out.println(indice);
            indice++;
        }
        //DO WHILE
        System.out.println("DO WHILE");
        do {
            System.out.println(indice);
            indice++;
        } while (indice < 10);
        //FOR
        for(int i =0; i < 10; i++) {
            System.out.println("indice");
        }
    }
     
}
