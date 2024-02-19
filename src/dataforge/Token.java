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

    //Constructor
    public Token(String token, String description) {
        this.token = token;
        this.description = description;
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
    
}
