/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author sebastiansolares
 */
public class MiSingleton {

    // Instancia única de la clase MiSingleton
    private static MiSingleton instancia;
    // Constructor privado para evitar la creación de instancias mediante el operador 'new'
    private MiSingleton() {
    }

    // Método estático para obtener la instancia única de la clase
    public static MiSingleton obtenerInstancia() {
        // Si la instancia aún no ha sido creada, la crea
        if (instancia == null) {
            instancia = new MiSingleton();
        }
        // Retorna la instancia existente o recién creada
        return instancia;
    }
    
    
    private String consola = "";
    
    public void add_consola(String data) {
        
        
        this.consola += data;
        
    }

    public String get_consola() {
        return this.consola;
    }

    public void clear_console(){
        this.consola = "";
    }

}