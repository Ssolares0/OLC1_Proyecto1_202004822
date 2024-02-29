/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataforge;

/**
 *
 * @author sebastiansolares
 */
public class Simbolos {
    //Atributos
    private String id;
   
    private String tipo;
    private String valor;
    private int Fila;
    private int Columna;

    //Constructor
    public Simbolos(String id, String tipo,String valor,int Fila, int Columna) {
        this.id = id;
        this.tipo = tipo;
        this.valor =valor;
        this.Fila =Fila;
        this.Columna=Columna;
        
    }

    //Getters y Setters
    public String getSimbolos() {
        return id;
    }
    public void setSimbolos(String id) {
        this.id = id;
    }
   
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public int getFila() {
        return Fila;
    }
    public void setFila(int Fila) {
        this.Fila = Fila;
    }
    public int getColumna() {
        return Columna;
    }
    public void setColumna(int Columna) {
        this.Columna = Columna;
    }
    
}
