
// ------------  Paquete e importaciones ------------
package analizadores; 

import java_cup.runtime.*;
import dataforge.Errores;
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
%} 




// ------------  Reglas Lexicas -------------------

//entero = [0-9]+
numero = [0-9]+("."[0-9]+)?
cadena = [\'][^\']*[\']|[\"][^\"]*[\"]
blancos = [ \t\f\r\n]+
comentario_oneL = "!".*\n
comentario_multL= <!"([^!]|!+[^>])*"!>
%%




    // ------------  Simbolos -------------------------

    ";"    { System.out.println("Reconocio punto y coma,lexema: "+yytext());
            return new Symbol(sym.PUNTOYCOMA, yycolumn, yyline, yytext()); }

    ":"    { System.out.println("Reconocio Dos puntos ,lexema: "+yytext());
            return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext()); }

    ","   { System.out.println("Reconocio coma ,lexema: "+yytext());
            return new Symbol(sym.COMA, yycolumn, yyline, yytext()); }

    "<-"   { System.out.println("Reconocio Assignacion llave ,lexema: "+yytext());
            return new Symbol(sym.ASSIGN, yycolumn, yyline, yytext()); }

    "@"    { System.out.println("Reconocio  ,lexema: "+yytext());
            return new Symbol(sym.ARROBA, yycolumn, yyline, yytext()); }

    "["   { System.out.println("Reconocio Corchete izquierdo ,lexema: "+yytext());
            return new Symbol(sym.COR_IZQ, yycolumn, yyline, yytext()); }
     
    "]"   { System.out.println("Reconocio Corchete derecho ,lexema: "+yytext());
            return new Symbol(sym.COR_DER, yycolumn, yyline, yytext()); }



            
    // ------------  Palabras -------------------------



    "var"           { System.out.println("Reconocio palabra ,lexema: "+yytext());
                      return new Symbol(sym.VAR, yycolumn, yyline, yytext()); }

    "double"        { System.out.println("Reconocio tipo de dato ,lexema: "+yytext());
                    return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext()); }

    "char[]"        { System.out.println("Reconocio tipo de dato ,lexema: "+yytext());
                    return new Symbol(sym.CHAR, yycolumn, yyline, yytext()); }
    "END PROGRAM"   { System.out.println("Reconocio palabra ,lexema: "+yytext());
                        return new Symbol(sym.ENDPROGRAM, yycolumn, yyline, yytext()); }
    
    "arr"           { System.out.println("Reconocio palabra ,lexema: "+yytext());
                        return new Symbol(sym.ARR, yycolumn, yyline, yytext()); }
                
    "end"           { System.out.println("Reconocio palabra ,lexema: "+yytext());
                        return new Symbol(sym.END, yycolumn, yyline, yytext()); }

    "PROGRAM"       { System.out.println("Reconocio palabra ,lexema: "+yytext());

                       return new Symbol(sym.PROGRAM, yycolumn, yyline, yytext()); }

    

    




    // {entero}  { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }

    {numero}  { System.out.println("Reconocio un numero,lexema: "+yytext());
               return new Symbol(sym.NUMERO, yycolumn, yyline, yytext());}

    {cadena}  { System.out.println("Reconocio una cadena,lexema: "+yytext())     
                 return new Symbol(sym.CADENA, yycolumn, yyline, yytext());}

    {blancos}  {} //THIS IGNORE THE SPACES

    {comentario_oneL} { System.out.println("Reconocio comentario una linea,lexema: "+yytext());
    }   
                        

 
    {comentario_multL} { System.out.println("Reconocio comentario multi linea: "+yytext());
                         } 
    
    
    
    
    



    

    //------> Errores Léxicos 

    .           	{ 
                        System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn); 
                        Errores tmp = new Errores("Lexico",yyline,yycolumn,"Componente"+yytext()+"No reconocido");
                        errLex.add(tmp);
    }

