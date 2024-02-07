/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracto;

/**
 *
 * @author sebastiansolares
 */
public class Types {
    public static enum Type {
        STRING,//0
        DECIMAL,//1
        ERRORS
    }
    
    double double_val;
    String string_val;
    Type type;
    
    public Types(double double_val, Type type){
        this.double_val = double_val;
        this.type = type;
    }
    
    public Types(String string_val, Type type){
        this.string_val = string_val;
        this.type = type;
    }
    

    public double getDouble_val() {
        return double_val;
    }

    public void setDouble_val(double double_val) {
        this.double_val = double_val;
    }

    public String getString_val() {
        return string_val;
    }

    public void setString_val(String string_val) {
        this.string_val = string_val;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public String obtenerValoresComoCadena() {
        if (type == Type.DECIMAL) {
            return "Tipo: " + type + ", Valor Double: " + double_val;
        } else if (type == Type.STRING) {
            return "Tipo: " + type + ", Valor String: " + string_val;
        } else {
            return "Tipo: " + type;
        }
    }
    
        
}
