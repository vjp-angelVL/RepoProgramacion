/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caritmetica2;

/**
 *
 * @author Ángel Vegas López
 */
public class CAritmetica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro las variables
        int dato1;
        int dato2;
        int dato3;
        int resultado;
        //Asigno un valor a cada variable
        dato1=5;
        dato2=10;
        dato3=20;
        
        //suma
        resultado = dato1 + dato2 +dato3; //Declaro el valor de la variable resultado
        System.out.println(dato1 + "+" + dato2 + "+" + dato3 + "=" + resultado); //Para imprimir el texto de la suma con el resultado
        
        //resta
        resultado = dato1 - dato2 - dato3; //Declaro el valor de la variable resultado
        System.out.println(dato1 + "-" + dato2 + "-" + dato3 + "=" + resultado); //Para imprimir el texto de la resta con el resultado
        
        //multiplicación
        resultado = dato1 * dato2 * dato3; //Declaro el valor de la variable resultado
        System.out.println(dato1 + "*" + dato2 + "*" + dato3 + "=" + resultado); //Para imprimir el texto de la multiplicación con el resultado
                    
    }
    
}
