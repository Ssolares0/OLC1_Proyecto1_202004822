/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadores;

/**
 *
 * @author sebastiansolares
 */
public class run {
    public static void main(String[] args) {
        try {
         //Ruta donde tenemos los archivos con extension .jflex y .cup
         String ruta = "src/analizadores/";
         String opcFlex[] = {ruta + "Lexico.jflex", "-d", ruta};
         jflex.Main.generate(opcFlex);
         String opcCUP[] = {"-destdir", ruta, "-parser", "Sintactico", ruta + "Sintactico.cup"};
         java_cup.Main.main(opcCUP);
         } catch (Exception e) {
          // TODO: handle exception
          e.printStackTrace();
         }
       }
    
}
