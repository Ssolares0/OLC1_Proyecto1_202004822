/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentence;

import abstracto.Expresions;
import abstracto.Types;
import abstracto.sentencia;
import abstracto.Types;
import abstracto.Types.Type;
import java.util.LinkedList;

import singleton.MiSingleton;

/**
 *
 * @author sebastiansolares
 */
public class declaracion implements sentencia{
    private int Line =0;
    private int Column =0;
    private String ID= "";
    private String valor="";
    
    
    public declaracion(String ID,String valor ,int Line,int Column){
        this.Column= Column;
        this.Line=Line;
        this.ID = ID;
        
        this.valor =valor ;
    }
    
    @Override
    public Object ejecutar(){
        
        //System.out.println(ID);
        //System.out.println(valor);
        
        return null;
        
     
    }
    
    // Getter para obtener el ID
    public String getID() {
        return ID;
    }

    // Getter para obtener el valor
    public String getValor() {
        return valor;
    }
    
    public String obtenerValorPorID(String id) {
        
        System.out.println(this.ID);
        
    if (this.ID.equalsIgnoreCase(id)) {  // Ignora diferencias de mayúsculas y minúsculas
        System.out.println(this.valor);
        return this.valor;
    } else {
        System.out.println("No encontre nada!");
        return null;
    }
}

}
