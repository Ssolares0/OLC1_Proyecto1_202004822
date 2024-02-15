/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadores;

import sentence.declaracion;
import abstracto.Expresions;
/**
 *
 * @author sebastiansolares
 */
public class funcionesUsar {
    public double resultado;
    public String printConsole; 
    public String numeroString;
    
    public static void main(String[] args) {
        operaciones("zz", 2.0, 2.0);
    }
    
   
    
    public void clean(){
        //esta funcion permite limpiar la consola

         printConsole = "sss"; 
         System.out.println(printConsole);
         //resultado == 2.2;
    }
    
    
    public static String buscarVariable(String id){
        declaracion miDeclaracion = new declaracion("miID", "miValor", 1, 1);

        // Llamada a la función obtenerValorPorID
        String valorEncontrado = miDeclaracion.obtenerValorPorID(id);

        if (valorEncontrado != null) {
            System.out.println("Valor encontrado: " + valorEncontrado);
            return valorEncontrado;
        } else {
            System.out.println("ID no encontrado.");
        }
        return valorEncontrado;
    
 
    
    } 
    
    public static double operaciones(String name, double a, double b) {
        
    String printConsole = ""; 
    double resultado = 0.0; 
    String numeroString = "";

    switch (name) {
        case "+":
            resultado = a + b;
            numeroString = Double.toString(resultado);
            System.out.println(numeroString);
            break;
        case "-":
            resultado = a - b;
            numeroString = Double.toString(resultado);
            System.out.println(numeroString);
            break;
        case "*":
            resultado = a * b;
            numeroString = Double.toString(resultado);
            System.out.println(numeroString);
            break;
        case "/":
            
            if (b != 0) {
                resultado = a / b;
                numeroString = Double.toString(resultado);
                System.out.println(numeroString);
            } else {
                System.out.println("Error: División por cero no permitida.");
            }
            break;
        case "%":
            resultado = a; 
            numeroString = Double.toString(resultado);
            System.out.println(numeroString);
            break;
        default:
            System.out.println("Error: Operación no reconocida.");
    }

    printConsole += "Operacion: " + name + " Resultado: " + Double.toString(resultado);

    return resultado;
}
    
}