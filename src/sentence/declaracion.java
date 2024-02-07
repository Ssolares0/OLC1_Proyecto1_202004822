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

/**
 *
 * @author sebastiansolares
 */
public class declaracion implements sentencia{
    private int Line =0;
    private int Column =0;
    private LinkedList<Expresions> exps;
    
    public declaracion(LinkedList<Expresions> exps,int Line,int Column){
        this.Column= Column;
        this.Line=Line;
        this.exps=exps ;
    }
    
    @Override
    public Object ejecutar(){
        System.out.println(exps);
        
    
        return null;
    }
    
}
