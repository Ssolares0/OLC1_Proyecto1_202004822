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
public class print implements sentencia{
    
    private int Line = 0;
    private int Column =0;
    private LinkedList<Expresions> exps;
    
    
    public print(LinkedList<Expresions> exps, int Line, int Column){
        
       this.Column = Column;
       this.Line = Line;
       this.exps = exps;
    
    }
    
    @Override
    public Object ejecutar(){
        MiSingleton singleton = MiSingleton.obtenerInstancia();
        
        singleton.add_consola("! Salida: ");
        
        for(Expresions exp: this.exps){
            Types run_exp = exp.ejecutarexp();
            
            if(run_exp != null){     
                if(run_exp.getType() == Type.STRING){
                    singleton.add_consola(run_exp.getString_val());
                }else{
                    singleton.add_consola(Double.toString(run_exp.getDouble_val()));
                }
                singleton.add_consola(", ");
            }
        }
        
        singleton.add_consola("\n");
        
    
        return null;
    }
    
    
}
