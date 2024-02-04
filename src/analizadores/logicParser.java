/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadores;

/**
 *
 * @author sebastiansolares
 */
public class logicParser {
    public static void main(String[] args) {
        //declaramos nuestras variables

    public Double resultado = 0.0;
    public Double printConsole = "";

    //funciones a usar

    public void clean(){
        //esta funcion permite limpiar la consola

          public static String printConsole = ""; 


    }

    public Double operaciones(String name,double a,double b){
            
            Double resultado = 0.0;
            
            switch (name){
                case "+":
                    resultado =a+b;
                    break;
                case "-":
                    resultado =a-b;
                
                case "*":
                    resultado = a*b;
                
                case "/":
                    resultado = a/b;
                    
                case "%":
                    resultado = a;

            }
            
            
            
            printConsole += "Operacion: " + name+ "Resultado:" + String.valueOf(resultado);
            return resultado;
        }
    

    
    
    
}
        
        
     
        
    }


