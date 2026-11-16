/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public class coche {
        private String marca;
        private String modelo;
        private String color;
        private int velocidad;
        private boolean encendido = false;
        
    public void encenderMotor () {
        if (encendido==true){
            System.out.println("El motor del coche está encendido");
        }
        else{
            encendido=true;
        }
    }
    public void apagarMotor () {
        if (encendido==false) {
            System.out.println("El motor del coche está apagado");
        }
        else {
            encendido=false;
        }
    public void setMarca (String BMW) {
        marca = BMW;
    }
    public void setModelo (String M4g82) {
        modelo = M4g82;
    }
    public void setColor (String Antracita) {
        color = Antracita;
    }
    public void setVelocidad (int 256) {
        velocidad = 256;
    }
    public void getCoche () {
        System.out.println("La marca del coche es " + marca " su modelo es " + modelo + "es de color" + color + " y va a una velocidad de " + velocidad + "Km/h");
    }
    }
    }
    
    
}
