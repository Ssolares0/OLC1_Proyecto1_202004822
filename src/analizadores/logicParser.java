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
    
    
    }
        
        
     
        public Double operaciones(String name,double a,double b){
            Double resultado = 0.0;
            
            switch (name){
                case "sum":
                    resultado =a+b;
                    break;
                case "res":
                    resultado =a-b;
                
                case "mul":
                    resultado = a*b;
                
                case "div":
                    resultado = a/b;
                    
                case "mod":
                    resultado = a;

            }
            
            
            
            printConsole += "Operacion: " + name+ "Resultado:" + String.valueOf(resultado);
            return resultado;
        }
    }


