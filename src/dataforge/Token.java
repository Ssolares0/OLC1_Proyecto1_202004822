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
    private int line;
    private int column;
    private String description;

    //Constructor
    public Token(String token, int line, int column, String description) {
        this.token = token;
        this.line = line;
        this.column = column;
        this.description = description;
    }

    //Getters y Setters
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public int getLine() {
        return line;
    }
    public void setLine(int line) {
        this.line = line;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public String getDescription() {
        return description;
    }
    public void setDesciption(String description) {
        this.description = description;
    }
    
}
