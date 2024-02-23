/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadores;

import sentence.declaracion;
import abstracto.Expresions;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author sebastiansolares
 */
public class funcionesUsar {

    public double resultado;
    public String printConsole;
    public String numeroString;

    public void clean() {
        //esta funcion permite limpiar la consola

        printConsole = "sss";
        System.out.println(printConsole);
        //resultado == 2.2;
    }

    public void imprr(String a) {
    }

    public static String buscarVariable(String id) {
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

    public static Double operacionAritmetica(String id, String num) {
        String id_min = id.toLowerCase();
        String[] partes = num.split("=");
        String valor1 = partes[0];
        String valor2 = partes[1];

        System.out.println("Valor1: " + valor1);
        System.out.println("Valor2: " + valor2);

        //pasamos a double
        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double resultado = 0.0;

        //creamos el switch 
        System.out.println("Empezamos con este ID: " + id);
        switch (id_min) {
            case "sum":
                resultado = numero1 + numero2;
                System.out.println("sum: " + resultado);
                break;
            case "res":
                resultado = numero1 - numero2;
                System.out.println("res: " + resultado);
                break;
            case "mul":
                resultado = numero1 * numero2;
                System.out.println("mul: " + resultado);
                break;
            case "div":

                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("div: " + resultado);

                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            case "mod":
                resultado = numero1;
                System.out.println("Mod: " + resultado);

                break;
            default:
                System.out.println("Error: Operación no reconocida.");
        }

        return resultado;

    }

    public static Double operacionEstadistica(String id, String num) {
        try {
            String id_min = id.toLowerCase();
            String[] partes = num.split(",");
            // Crear un arreglo de tipo double para almacenar los números
            double[] numeros = new double[partes.length];
            // Convertir cada elemento de la lista de cadenas a double
            for (int i = 0; i < partes.length; i++) {
                numeros[i] = Double.parseDouble(partes[i]);
            }
            double media = 0.0;
            double resultado = 0.0;

            switch (id_min) {
                case "media":
                    // Calcular la suma de los números
                    double suma = 0;
                    for (double numero : numeros) {
                        suma += numero;
                    }
                    // Calcular el promedio
                    double promedio = suma / numeros.length;

                    // Imprimir el promedio
                    System.out.println("La media es: " + promedio);

                    resultado = promedio;
                    media = promedio;

                    break;

                case "mediana":

                    //Ordenar la lista de números
                    Arrays.sort(numeros);

                    int n = numeros.length;

                    if (n % 2 == 0) {
                        // Si la lista tiene un número par de elementos, la mediana es el promedio de los dos valores centrales
                        resultado = (numeros[n / 2 - 1] + numeros[n / 2]) / 2.0;
                        System.out.println("La mediana es: " + resultado);
                    } else {
                        // Si la lista tiene un número impar de elementos, la mediana es el valor central
                        resultado = numeros[n / 2];
                        System.out.println("La mediana es: " + resultado);
                    }

                    break;

                case "moda":
                    int maximoNumRepeticiones = 0;
                    double moda = 0;

                    for (int i = 0; i < numeros.length; i++) {
                        int numRepeticiones = 0;
                        for (int j = 0; j < numeros.length; j++) {
                            if (numeros[i] == numeros[j]) {
                                numRepeticiones++;
                            }
                            if (numRepeticiones > maximoNumRepeticiones) {
                                moda = numeros[i];

                                maximoNumRepeticiones = numRepeticiones;
                            }
                        }
                    }
                    resultado = moda;
                    System.out.println("la moda es: " + moda);
                    break;

                case "varianza":
                    for (int i = 0; i < numeros.length; i++) {
                        double rango;
                        rango = Math.pow(numeros[i] - media, 2f);
                        resultado = resultado + rango;
                    }
                    resultado = resultado / numeros.length;
                    System.out.println("la varianza es: " + resultado);
                    break;
                case "max":
                    double numeromayor;
                    numeromayor = numeros[0];
                    for (int i = 0; i < numeros.length; i++) {

                        if (numeros[i] > numeromayor) {
                            numeromayor = numeros[i];

                        }
                    }
                    resultado = numeromayor;
                    System.out.println("el max es: " + resultado);
                    break;

                case "min":
                    double numeromenor;
                    numeromenor = numeros[0];
                    for (int i = 0; i < numeros.length; i++) {

                        if (numeros[i] < numeromenor) {
                            numeromenor = numeros[i];

                        }
                    }
                    resultado = numeromenor;

                    System.out.println("el min es: " + resultado);
                    break;
                default:
                    System.out.println("Error: Operacion no reconocida.");

            }

            return resultado;

        } catch (Exception e) {
            System.out.println("ocurrio un error al intentar hacer una op estadistica");
            return 0.0;
        }

    }

}
