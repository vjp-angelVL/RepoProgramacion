/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author Ángel Vegas López
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Declaro todas las variables
        int tiempo = 10000;
        int horas = (tiempo/60); //Para sacar las horas
        int minutos = (tiempo % 3600)/60; //Para sacar los minutos
        int segundos = tiempo % 60; //Para sacar los segundos
        //Imprimo el mensaje por pantalla
        System.out.println("10.000 segundos hacen un total de: " + horas + "horas," +minutos+ "minutos y" +segundos+ "segundos.");
                
    }
    
}
