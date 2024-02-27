/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataforge;

/**
 *
 * @author sebastiansolares
 */
public class Token {
    //Atributos
    private String token;
   
    private String description;
    private int Fila;
    private int Columna;

    //Constructor
    public Token(String token, String description,int Fila, int Columna) {
        this.token = token;
        this.description = description;
        this.Fila =Fila;
        this.Columna=Columna;
        
    }

    //Getters y Setters
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
   
    public String getDescription() {
        return description;
    }
    public void setDesciption(String description) {
        this.description = description;
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
