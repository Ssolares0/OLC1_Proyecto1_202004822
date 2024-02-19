
// ------------  Paquete e importaciones ------------
package analizadores; 

import java_cup.runtime.*;
import dataforge.Errores;
import dataforge.Token;
import java.util.ArrayList;

%%	
//-------> Directivas (No tocar)

%public 
%class Lexico
%cup
%char
%column
%line
%unicode
%ignorecase

%{ 
    public ArrayList<Errores> errLex = new ArrayList<Errores>();
    public ArrayList<Token> tokLex = new ArrayList<Token>();
%} 




// ------------  Reglas Lexicas -------------------

//entero = [0-9]+

comentario_oneL = "!"[^\r\n]* (\r|\n|\r\n)?
comentario_multL = "<!"([^\r\n]* (\r|\n|\r\n?)?)*"!>"


numero = [0-9]+("."[0-9]+)?
id = [a-zA-Z_][a-zA-Z0-9_]*
//id_array = @([a-zA-Z_][a-zA-Z0-9_]*)
cadena = [\'][^\']*[\']|[\"][^\"]*[\"]
blancos = [ \t\f\r\n]+


%%



<YYINITIAL>{
    // ------------  Simbolos -------------------------

    ";"    { System.out.println("Reconocio punto y coma,lexema: "+yytext());

            Token tmp = new Token(yytext(),"delimitador");
            tokLex.add(tmp);
            return new Symbol(sym.PUNTOYCOMA, yycolumn, yyline, yytext()); }

    ":"    { System.out.println("Reconocio Dos puntos ,lexema: "+yytext());
            Token tmp = new Token(yytext(),"delimitador");
            tokLex.add(tmp);
            return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext()); }
            
    ","   { System.out.println("Reconocio coma ,lexema: "+yytext());
            Token tmp = new Token(yytext(),"delimitador");
            tokLex.add(tmp);
            return new Symbol(sym.COMA, yycolumn, yyline, yytext()); }

    "<-"   { System.out.println("Reconocio Assignacion llave ,lexema: "+yytext());
            Token tmp = new Token(yytext(),"delimitador");
            tokLex.add(tmp);
            return new Symbol(sym.ASSIGN, yycolumn, yyline, yytext()); }
    
    "->"   { System.out.println("Reconocio Assignacion llave derecha  ,lexema: "+yytext());
            Token tmp = new Token(yytext(),"delimitador");
            tokLex.add(tmp);
            return new Symbol(sym.ASSIGN2, yycolumn, yyline, yytext()); }

    

    "["   { System.out.println("Reconocio Corchete izquierdo ,lexema: "+yytext());
            Token tmp = new Token(yytext(),"delimitador");
            tokLex.add(tmp);
            return new Symbol(sym.COR_IZQ, yycolumn, yyline, yytext()); }
     
    "]"   { System.out.println("Reconocio Corchete derecho ,lexema: "+yytext());
            Token tmp = new Token(yytext(),"delimitador");
            tokLex.add(tmp);
            return new Symbol(sym.COR_DER, yycolumn, yyline, yytext()); }
    
    "="   { System.out.println("Reconocio Signo igual ,lexema: "+yytext());
            Token tmp = new Token(yytext(),"operador");
            tokLex.add(tmp);
            return new Symbol(sym.IGUAL, yycolumn, yyline, yytext()); }

    "("   { System.out.println("Reconocio PARENTESIS IZQ ,lexema: "+yytext());
            Token tmp = new Token(yytext(),"delimitador");
            tokLex.add(tmp);
            return new Symbol(sym.PAR_IZQ, yycolumn, yyline, yytext()); }

    ")"   { System.out.println("Reconocio PARENTESIS DER ,lexema: "+yytext());  
            Token tmp = new Token(yytext(),"delimitador");
            tokLex.add(tmp);
            return new Symbol(sym.PAR_DER, yycolumn, yyline, yytext()); }

    "@"   { System.out.println("Reconocio ARROBA  ,lexema: "+yytext());
            Token tmp = new Token(yytext(),"simbolo");
            tokLex.add(tmp);
            return new Symbol(sym.ARROBA, yycolumn, yyline, yytext()); }



            
    // ------------  Palabras -------------------------



    "var"           { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                      return new Symbol(sym.VAR, yycolumn, yyline, yytext()); }

    "double"        { System.out.println("Reconocio tipo de dato ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                    return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext()); }

    "char[]"        { System.out.println("Reconocio tipo de dato ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                    return new Symbol(sym.CHAR, yycolumn, yyline, yytext()); }

    "END PROGRAM"   { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                    return new Symbol(sym.ENDPROGRAM, yycolumn, yyline, yytext()); }
    
    "arr"           { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                    return new Symbol(sym.ARR, yycolumn, yyline, yytext()); }
                
    "end"           { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                        return new Symbol(sym.END, yycolumn, yyline, yytext()); }

    "PROGRAM"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.PROGRAM, yycolumn, yyline, yytext()); }

    "CONSOLE"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext()); }
     
    "COLUMN"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.COLUMN, yycolumn, yyline, yytext()); }
    
                   
    "PRINT"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.PRINT, yycolumn, yyline, yytext()); }


    "SUM"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.sum, yycolumn, yyline, yytext()); }

    "RES"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.res, yycolumn, yyline, yytext()); }

    "MUL"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.mul, yycolumn, yyline, yytext()); }

    "MOD"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.mod, yycolumn, yyline, yytext()); }

    "DIV"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.div, yycolumn, yyline, yytext()); }
    
    "Media"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.media, yycolumn, yyline, yytext()); }

    "Mediana"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.mediana, yycolumn, yyline, yytext()); }

    "Moda"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.moda, yycolumn, yyline, yytext()); }

    "Varianza"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.varianza, yycolumn, yyline, yytext()); }

    "Max"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                       return new Symbol(sym.max, yycolumn, yyline, yytext()); }

    "Max"       { System.out.println("Reconocio palabra ,lexema: "+yytext());
                    Token tmp = new Token(yytext(),"Palabra Reservada");
                    tokLex.add(tmp);
                           return new Symbol(sym.min, yycolumn, yyline, yytext()); }

    




    // {entero}  { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }

    {comentario_multL} { System.out.println("Reconocio comentario multi linea: "+yytext());} 
    
    {comentario_oneL} { System.out.println("Reconocio comentario una linea,lexema: "+yytext());}   
    
                   
    

    {numero}  { System.out.println("Reconocio un numero,lexema: "+yytext());
                Token tmp = new Token(yytext(),"Numero");
                   tokLex.add(tmp);
               return new Symbol(sym.NUMERO, yycolumn, yyline, yytext());}

    {id}  { System.out.println("Reconocio el id de una declaracion de variable,lexema: "+yytext());
            Token tmp = new Token(yytext(),"ID VARIABLE");
            tokLex.add(tmp);
              return new Symbol(sym.ID, yycolumn, yyline, yytext());}

    //{id_array}  { System.out.println("Reconocio el id de un array ,lexema: "+yytext());
    //          return new Symbol(sym.ID_ARRAY, yycolumn, yyline, yytext());}


    {cadena}  { System.out.println("Reconocio una cadena,lexema: "+yytext());
                Token tmp = new Token(yytext(),"Cadena");
                 tokLex.add(tmp);
                 return new Symbol(sym.CADENA, yycolumn, yyline, yytext());}

    {blancos}  {} //THIS IGNORE THE SPACES

    
    
    
}

    //------> Errores Léxicos 

    .           	{ 
                        System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); 
                        Errores tmp = new Errores("Lexico",yyline,yycolumn,"Componente"+yytext()+"No reconocido");
                        errLex.add(tmp);
    }

