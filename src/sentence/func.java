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
public class func implements sentencia{
    
    private String funcion= "";
    
    
    
    public func(String funcion){
       this.funcion = funcion;
    }
    
    @Override
    public Object ejecutar(){
        
        //System.out.println(ID);
        //System.out.println(valor);
        
        return null;
        
     
    }
    
    // Getter para obtener el ID
    public String getfunc() {
        return funcion;
    }
}