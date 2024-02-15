/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sentence;

import abstracto.Expresions;
import abstracto.sentencia;
import java.util.LinkedList;
import abstracto.Types;
import abstracto.Types.Type;

import singleton.MiSingleton;

/**
 *
 * @author sebastiansolares
 */
public class declaracionArray implements sentencia{
    
    private int Line = 0;
    private int Column =0;
    private String Tipo ="";
    private String Id = "";
    private LinkedList<Expresions> exps;
    
    
    public declaracionArray(LinkedList<Expresions> exps, int Line, int Column,String Tipo, String Id){
        
       this.Column = Column;
       this.Line = Line;
       this.exps = exps;
       this.Tipo=Tipo;
       this.Id=Id;
    }
    
    @Override
    public Object ejecutar(){

        System.out.println("declaracion de array exitosa:  "+this.Id+this.exps);
        return null;
    }
    
    
}
