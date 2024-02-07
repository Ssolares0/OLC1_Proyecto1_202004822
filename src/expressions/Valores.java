/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expressions;
import abstracto.Expresions;
import abstracto.Types;
import abstracto.Types.Type;

/**
 *
 * @author sebastiansolares
 */
public class Valores implements Expresions{
    public static enum Datatype {
        DECIMAL,
        CADENA,
        VARIABLE
    }
    
    private int Line = 0;
    private int Column =0;
    private String value = "";
    private Datatype datatype;
    
    public Valores(String value, Datatype datatype, int Line, int Column){
       this.value = value;
       this.Column = Column;
       this.Line = Line;
       this.datatype = datatype;
    
    }
    
    @Override
    public Types ejecutarexp(){
        if(this.datatype == Datatype.CADENA){
            return new Types(value.replaceAll("\"", ""),Type.STRING);
        }else if(this.datatype == Datatype.DECIMAL){
            return new Types(Double.valueOf(value),Type.DECIMAL);
            

        }else if(this.datatype == Datatype.VARIABLE){
            return new Types(value,Type.STRING);
        }else{
            return null;
        }
      
    }
}
