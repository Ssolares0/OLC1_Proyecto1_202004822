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
    

    
    public void clean(){
        //esta funcion permite limpiar la consola

         printConsole = "sss"; 
         System.out.println(printConsole);
         //resultado == 2.2;
    }
    
    public void imprr(String a){
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
    
        public static Double operacionAritmetica(String id,String num){
        String id_min = id.toLowerCase();
        String[] partes = num.split("=");
        String valor1 = partes[0];
        String valor2 = partes[1];
        
        System.out.println("Valor1: "+valor1);
        System.out.println("Valor2: "+valor2);
        
        //pasamos a double
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double resultado = 0.0; 
        
        //creamos el switch 
        System.out.println("Empezamos con este ID: "+id);
       switch (id_min) {
            case "sum":
                resultado = numero1 + numero2;
                System.out.println("sum: "+resultado);
                break;
            case "res":
                resultado = numero1 - numero2;
                System.out.println("res: "+resultado);
                break;
            case "mul":
                resultado = numero1 * numero2;
                System.out.println("mul: "+resultado);
                break;
            case "div":

                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("div: "+resultado);

                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            case "mod":
                resultado = numero1; 
                System.out.println("Mod: "+resultado);
                

                break;
            default:
                System.out.println("Error: Operación no reconocida.");
        }
        
            return resultado;
    
    }
    
    public static Double operacionEstadistica(String id,String num){
        String id_min = id.toLowerCase();
        String[] partes = num.split("=");
        // Crear un arreglo de tipo double para almacenar los números
        double[] numeros = new double[partes.length];
        // Convertir cada elemento de la lista de cadenas a double
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Double.parseDouble(partes[i]);
        }
        
        double resultado = 0.0; 
        
        switch (id_min) {
            case "media":
                // Calcular la suma de los números
                double suma = 0;
                for (double numero : numeros) {
                    suma += numero;
                }
                // Calcular el promedio
                double promedio = suma / numeros.length;

                // Imprimir el promedio
                System.out.println("La media es: " + promedio);
                
                resultado = promedio;
                
                break;
            default:
                System.out.println("Error: Operacion no reconocida.");
        }
        
       
        return resultado;
    
    }
    
    
    
}
