
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores;

import java_cup.runtime.*;
import java.util.LinkedList;
import expressions.Valores;
import sentence.print;
import sentence.declaracionArray;
import sentence.declaracion;
import abstracto.Expresions;
import abstracto.sentencia;
import abstracto.Types;
import abstracto.Types.Type;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\041\000\002\002\004\000\002\002\005\000\002\024" +
    "\004\000\002\024\003\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\005\000\002\004\012\000" +
    "\002\017\015\000\002\014\010\000\002\020\006\000\002" +
    "\020\006\000\002\020\006\000\002\020\006\000\002\020" +
    "\006\000\002\006\007\000\002\006\003\000\002\007\003" +
    "\000\002\007\003\000\002\026\002\000\002\016\015\000" +
    "\002\011\003\000\002\011\003\000\002\005\003\000\002" +
    "\005\003\000\002\025\005\000\002\025\003\000\002\012" +
    "\003\000\002\012\003\000\002\015\003\000\002\015\003" +
    "\000\002\015\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\135\000\004\040\005\001\002\000\004\002\137\001" +
    "\002\000\010\017\015\033\012\036\006\001\002\000\004" +
    "\013\125\001\002\000\012\017\ufffe\033\ufffe\036\ufffe\041" +
    "\ufffe\001\002\000\004\037\123\001\002\000\004\037\121" +
    "\001\002\000\004\013\051\001\002\000\004\037\047\001" +
    "\002\000\012\017\015\033\012\036\006\041\046\001\002" +
    "\000\004\013\021\001\002\000\004\037\017\001\002\000" +
    "\004\014\020\001\002\000\012\017\ufffd\033\ufffd\036\ufffd" +
    "\041\ufffd\001\002\000\004\013\022\001\002\000\006\020" +
    "\024\021\023\001\002\000\004\022\043\001\002\000\004" +
    "\022\025\001\002\000\006\005\030\015\026\001\002\000" +
    "\004\012\uffea\001\002\000\004\012\031\001\002\000\004" +
    "\012\uffeb\001\002\000\004\007\032\001\002\000\006\004" +
    "\033\005\036\001\002\000\010\006\uffe5\010\uffe5\037\uffe5" +
    "\001\002\000\010\006\uffe6\010\uffe6\037\uffe6\001\002\000" +
    "\006\006\037\010\uffed\001\002\000\010\006\uffe4\010\uffe4" +
    "\037\uffe4\001\002\000\006\004\033\005\036\001\002\000" +
    "\004\010\041\001\002\000\004\037\uffec\001\002\000\010" +
    "\006\uffe7\010\uffe7\037\uffe7\001\002\000\006\004\033\005" +
    "\036\001\002\000\006\006\037\037\ufff7\001\002\000\012" +
    "\017\uffff\033\uffff\036\uffff\041\uffff\001\002\000\004\002" +
    "\000\001\002\000\004\014\050\001\002\000\012\017\ufffa" +
    "\033\ufffa\036\ufffa\041\ufffa\001\002\000\006\034\052\035" +
    "\054\001\002\000\004\013\uffe8\001\002\000\004\013\055" +
    "\001\002\000\004\013\uffe9\001\002\000\004\013\056\001" +
    "\002\000\004\015\057\001\002\000\004\011\060\001\002" +
    "\000\020\004\065\005\061\026\064\027\066\030\063\031" +
    "\067\032\062\001\002\000\004\037\uffe2\001\002\000\004" +
    "\023\116\001\002\000\004\023\113\001\002\000\004\023" +
    "\110\001\002\000\004\037\uffe3\001\002\000\004\023\105" +
    "\001\002\000\004\023\072\001\002\000\004\037\ufff9\001" +
    "\002\000\004\037\uffe1\001\002\000\016\004\075\026\064" +
    "\027\066\030\063\031\067\032\062\001\002\000\004\024" +
    "\104\001\002\000\004\024\ufff0\001\002\000\006\006\uffee" +
    "\024\uffee\001\002\000\004\006\100\001\002\000\006\006" +
    "\uffef\024\uffef\001\002\000\016\004\075\026\064\027\066" +
    "\030\063\031\067\032\062\001\002\000\004\006\102\001" +
    "\002\000\016\004\075\026\064\027\066\030\063\031\067" +
    "\032\062\001\002\000\004\024\ufff1\001\002\000\010\006" +
    "\ufff3\024\ufff3\037\ufff3\001\002\000\016\004\075\026\064" +
    "\027\066\030\063\031\067\032\062\001\002\000\004\024" +
    "\107\001\002\000\010\006\ufff5\024\ufff5\037\ufff5\001\002" +
    "\000\016\004\075\026\064\027\066\030\063\031\067\032" +
    "\062\001\002\000\004\024\112\001\002\000\010\006\ufff6" +
    "\024\ufff6\037\ufff6\001\002\000\016\004\075\026\064\027" +
    "\066\030\063\031\067\032\062\001\002\000\004\024\115" +
    "\001\002\000\010\006\ufff4\024\ufff4\037\ufff4\001\002\000" +
    "\016\004\075\026\064\027\066\030\063\031\067\032\062" +
    "\001\002\000\004\024\120\001\002\000\010\006\ufff2\024" +
    "\ufff2\037\ufff2\001\002\000\004\014\122\001\002\000\012" +
    "\017\ufffb\033\ufffb\036\ufffb\041\ufffb\001\002\000\004\014" +
    "\124\001\002\000\012\017\ufffc\033\ufffc\036\ufffc\041\ufffc" +
    "\001\002\000\006\034\052\035\054\001\002\000\004\013" +
    "\127\001\002\000\004\013\130\001\002\000\004\025\131" +
    "\001\002\000\004\015\132\001\002\000\004\011\133\001" +
    "\002\000\004\007\134\001\002\000\006\004\033\005\036" +
    "\001\002\000\006\006\037\010\136\001\002\000\004\037" +
    "\ufff8\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\135\000\004\002\003\001\001\000\002\001\001\000" +
    "\016\003\006\004\010\014\015\016\007\017\012\024\013" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\003\044\004\010\014\015\016\007\017\012\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\011\026\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\012\033\025\034\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\026\037\001\001\000" +
    "\002\001\001\000\004\012\041\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\012\033\025" +
    "\043\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\005" +
    "\052\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\015\067\020\070\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\006\072\007\073\020" +
    "\076\023\075\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\007\100\020\076\001\001\000\002\001\001\000\006" +
    "\007\102\020\076\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\006\105\007\073\020\076\023\075\001\001" +
    "\000\002\001\001\000\002\001\001\000\012\006\110\007" +
    "\073\020\076\023\075\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\006\113\007\073\020\076\023\075\001" +
    "\001\000\002\001\001\000\002\001\001\000\012\006\116" +
    "\007\073\020\076\023\075\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\005\125\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\006\012" +
    "\033\025\134\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  

    public LinkedList<sentencia>AST;
    

    public LinkedList<sentencia>getAST(){
    
        return AST;

    }
    class Triple<T, U, V> {
    T first;
    U second;
    V third;

    Triple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
        }
    }   

    public static String buscarVariable(String id){
        declaracion miDeclaracion = new declaracion("miID", "miValor", 1, 1);

        // Llamada a la función obtenerValorPorID
        String valorEncontrado = miDeclaracion.obtenerValorPorID(id);

        if (valorEncontrado != null) {
            System.out.println("Valor encontrado: " + valorEncontrado);
            return valorEncontrado;
        } else {
            System.out.println("ID no encontrado.");
        }
        return valorEncontrado;
    
 
    
    } 
    
    
   
    public void syntax_error(Symbol s)
    {
            System.err.println("Error Sintactico: "+ s.value + " - Fila: " + s.right + " - Columna: " + s.left + ". Recuperado" );
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {
            System.err.println("Error Sintactico: "+ s.value + " - Fila: " + s.right + " - Columna: " + s.left + ". Sin recuperacion." );
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactico$actions {

  
  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action_part00000000(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= PROGRAM INSTRUCCIONES ENDPROGRAM 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		LinkedList<sentencia> b = (LinkedList<sentencia>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		 parser.AST=b; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INSTRUCCIONES ::= INSTRUCCIONES INSTRUCCION 
            {
              LinkedList<sentencia> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		LinkedList<sentencia> a = (LinkedList<sentencia>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		sentencia b = (sentencia)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT= a; RESULT.add(b); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONES",18, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INSTRUCCIONES ::= INSTRUCCION 
            {
              LinkedList<sentencia> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		sentencia a = (sentencia)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = new LinkedList<>(); RESULT.add(a); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONES",18, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INSTRUCCION ::= IMPRIMIR_EXP END PUNTOYCOMA 
            {
              sentencia RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		print a = (print)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		RESULT =a; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // INSTRUCCION ::= IMPRIMIR_ARRAY END PUNTOYCOMA 
            {
              sentencia RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		print a = (print)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		 RESULT=a; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // INSTRUCCION ::= DECLARACION END PUNTOYCOMA 
            {
              sentencia RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		declaracion a = (declaracion)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		 RESULT=a; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // INSTRUCCION ::= Dec_Arreglo END PUNTOYCOMA 
            {
              sentencia RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		declaracionArray a = (declaracionArray)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		RESULT=a; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DECLARACION ::= VAR DOSPUNTOS TIPO DOSPUNTOS DOSPUNTOS ID ASSIGN valores_variable 
            {
              declaracion RESULT =null;
		int id_varleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int id_varright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String id_var = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int exp_valeft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int exp_varight = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object exp_va = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = new declaracion(id_var,exp_va.toString(),exp_varight,exp_valeft); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-7)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Dec_Arreglo ::= ARR DOSPUNTOS TIPO DOSPUNTOS DOSPUNTOS ARROBA ID ASSIGN COR_IZQ EXP_SUCESIVAS COR_DER 
            {
              declaracionArray RESULT =null;
		int tipo_arrleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-8)).left;
		int tipo_arrright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-8)).right;
		Object tipo_arr = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-8)).value;
		int id_arrleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).left;
		int id_arrright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).right;
		String id_arr = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).value;
		int exp_sleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int exp_sright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		LinkedList<Expresions> exp_s = (LinkedList<Expresions>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = new declaracionArray(exp_s,exp_sright, exp_sleft,tipo_arr.toString(),id_arr.toString()); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("Dec_Arreglo",13, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-10)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // IMPRIMIR_EXP ::= CONSOLE DOSPUNTOS DOSPUNTOS PRINT IGUAL EXP_SUCESIVAS 
            {
              print RESULT =null;
		int exp_sleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int exp_sright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		LinkedList<Expresions> exp_s = (LinkedList<Expresions>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = new print(exp_s,exp_sright, exp_sleft); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("IMPRIMIR_EXP",10, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // OP_ARITMETICA ::= sum PAR_IZQ OP PAR_DER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OP_ARITMETICA",14, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // OP_ARITMETICA ::= res PAR_IZQ OP PAR_DER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OP_ARITMETICA",14, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // OP_ARITMETICA ::= mul PAR_IZQ OP PAR_DER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OP_ARITMETICA",14, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // OP_ARITMETICA ::= mod PAR_IZQ OP PAR_DER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OP_ARITMETICA",14, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // OP_ARITMETICA ::= div PAR_IZQ OP PAR_DER 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OP_ARITMETICA",14, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // OP ::= IDENTIFICADOR COMA OP2 COMA OP2 
            {
              Object RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).right;
		Object op = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).value;
		int numaleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int numaright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		Object numa = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int numbleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int numbright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Object numb = (Object)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = new Triple<>(op, numa, numb); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OP",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // OP ::= OP2 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OP",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // OP2 ::= OP_ARITMETICA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OP2",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // OP2 ::= NUMERO 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("OP2",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // NT$0 ::= 
            {
              print RESULT =null;
		int exp_sleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int exp_sright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		LinkedList<Expresions> exp_s = (LinkedList<Expresions>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
 RESULT = new print(exp_s,exp_sright, exp_sleft); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("NT$0",20, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // IMPRIMIR_ARRAY ::= CONSOLE DOSPUNTOS DOSPUNTOS COLUMN IGUAL EXP_TITULO ASSIGN2 COR_IZQ EXP_SUCESIVAS NT$0 COR_DER 
            {
              print RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (print) ((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int exp_sleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int exp_sright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		LinkedList<Expresions> exp_s = (LinkedList<Expresions>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("IMPRIMIR_ARRAY",12, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-10)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // EXP_TITULO ::= CADENA 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXP_TITULO",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // EXP_TITULO ::= ID 
            {
              Object RESULT =null;

              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXP_TITULO",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // TIPO ::= CHAR 
            {
              Object RESULT =null;
		int char_left = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int char_right = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String char_ = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = char_; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIPO",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // TIPO ::= DOUBLE 
            {
              Object RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String num = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = num; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("TIPO",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // EXP_SUCESIVAS ::= EXP_SUCESIVAS COMA valores_print 
            {
              LinkedList<Expresions> RESULT =null;
		int exp_sleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int exp_sright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		LinkedList<Expresions> exp_s = (LinkedList<Expresions>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Expresions val = (Expresions)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = exp_s; RESULT.add(val); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXP_SUCESIVAS",19, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // EXP_SUCESIVAS ::= valores_print 
            {
              LinkedList<Expresions> RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Expresions val = (Expresions)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = new LinkedList<>(); RESULT.add(val); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXP_SUCESIVAS",19, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // valores_print ::= NUMERO 
            {
              Expresions RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String num = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = new Valores(num,Valores.Datatype.DECIMAL,numright,numleft); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("valores_print",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // valores_print ::= CADENA 
            {
              Expresions RESULT =null;
		int cadleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int cadright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String cad = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		RESULT = new Valores(cad,Valores.Datatype.CADENA,cadright,cadleft); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("valores_print",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // valores_variable ::= NUMERO 
            {
              Object RESULT =null;
		int numeroleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int numeroright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String numero = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = numero; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("valores_variable",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // valores_variable ::= CADENA 
            {
              Object RESULT =null;
		int cadenaleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int cadenaright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String cadena = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT = cadena; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("valores_variable",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // valores_variable ::= OP_ARITMETICA 
            {
              Object RESULT =null;
		RESULT= "prueba";
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("valores_variable",11, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Sintactico$do_action_part00000000(
                               CUP$Sintactico$act_num,
                               CUP$Sintactico$parser,
                               CUP$Sintactico$stack,
                               CUP$Sintactico$top);
    }
}

}
